package typings.chromeApps.chrome

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.enterprise.*
// #region chrome.events
////////////
// Events //
////////////
/**
  * The chrome.events namespace contains common types used by APIs
  * dispatching events to notify you when something interesting happens.
  *
  * An Event is an object that allows you to be notified when something interesting happens.
  * Here's an example of using the chrome.alarms.onAlarm event to be notified whenever an alarm has elapsed:
  * @example
  * chrome.alarms.onAlarm.addListener(function(alarm) {
  *   appendToLog('alarms.onAlarm --'
  *               + ' name: '          + alarm.name
  *               + ' scheduledTime: ' + alarm.scheduledTime);
  * });
  * @description
  * As the example shows, you register for notification using addListener().
  * The argument to addListener() is always a function that you define to
  * handle the event, but the parameters to the function depend on which
  * event you're handling. Checking the documentation for alarms.onAlarm,
  * you can see that the function has a single parameter: an alarms.Alarm
  * object that has details about the elapsed alarm.
  * @since Chrome 25.
  */
object events {
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  @js.native
  trait Event[T /* <: js.Function */] extends StObject {
    
    /**
      * Registers an event listener callback to an event.
      * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
      */
    def addListener(callback: T): Unit = js.native
    
    /**
      * Registers rules to handle events.
      * @param rules Rules to be registered. These do not replace previously registered rules.
      * @param callback Called with registered rules.
      * Parameter rules: Rules that were registered, the optional parameters are filled with values.
      */
    def addRules(rules: js.Array[Rule[Any, Any]]): Unit = js.native
    def addRules(
      rules: js.Array[Rule[Any, Any]],
      callback: js.Function1[/* rules */ js.Array[Rule[Any, Any]], Unit]
    ): Unit = js.native
    
    /**
      * Returns currently registered rules.
      * @param callback Called with registered rules.
      * Parameter *rules*: Rules that were registered, the optional parameters are filled with values.
      */
    def getRules(callback: js.Function1[/* rules */ js.Array[Rule[Any, Any]], Unit]): Unit = js.native
    /**
      * Returns currently registered rules.
      * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are returned.
      * @param callback Called with registered rules.
      * Parameter *rules*: Rules that were registered, the optional parameters are filled with values.
      */
    def getRules(
      ruleIdentifiers: js.Array[String],
      callback: js.Function1[/* rules */ js.Array[Rule[Any, Any]], Unit]
    ): Unit = js.native
    
    /**
      * Has this event this provided listener?
      * @param listener Listener whose registration status shall be tested.
      * @return If it has the provided listener
      */
    def hasListener(callback: T): Boolean = js.native
    def hasListener(callback: js.Function): Boolean = js.native
    
    /**
      * Has this event listeners?
      */
    def hasListeners(): Boolean = js.native
    
    /**
      * Deregisters an event listener callback from an event.
      * @param callback Listener that shall be unregistered.
      */
    def removeListener(callback: T): Unit = js.native
    
    /**
      * Unregisters currently registered rules.
      * @param ruleIdentifiers If an array is passed, only rules with identifiers contained in this array are unregistered.
      * @param callback Called when rules were unregistered.
      * If you specify the callback parameter, it should be a function that looks like this:
      * function() {...};
      */
    def removeRules(): Unit = js.native
    def removeRules(callback: js.Function0[Unit]): Unit = js.native
    def removeRules(ruleIdentifiers: js.Array[String]): Unit = js.native
    def removeRules(ruleIdentifiers: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    def removeRules(ruleIdentifiers: Unit, callback: js.Function0[Unit]): Unit = js.native
  }
  
  type EventFilter = StringDictionary[String]
  
  /**
    * An object which allows the addition and removal of listeners for a Chrome event.
    * Also provides the possibility to provide a filter
    * @template T Callback function.
    * @template F Filter interface, leave this for default
    */
  @js.native
  trait FilteredEvent[T /* <: js.Function */, F]
    extends StObject
       with Event[T] {
    
    def addListener(callback: T, filter: F): Unit = js.native
  }
  
  /**
    * Description of a declarative rule for handling events.
    * @template T Type for conditions array, default: any.
    * @template K Type for actions array, default: any.
    */
  trait Rule[T /* <: js.Object */, K /* <: js.Object */] extends StObject {
    
    /** List of actions that are triggered if one of the condtions is fulfilled. */
    var actions: js.Array[K]
    
    /** List of conditions that can trigger the actions. */
    var conditions: js.Array[T]
    
    /** Identifier that allows referencing this rule.  */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Optional priority of this rule.
      * @default 100
      */
    var priority: js.UndefOr[integer] = js.undefined
    
    /**
      * Tags can be used to annotate rules and perform operations on sets of rules.
      * @since Chrome 28.
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Rule {
    
    inline def apply[T /* <: js.Object */, K /* <: js.Object */](actions: js.Array[K], conditions: js.Array[T]): Rule[T, K] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rule[?, ?], T /* <: js.Object */, K /* <: js.Object */] (val x: Self & (Rule[T, K])) extends AnyVal {
      
      inline def setActions(value: js.Array[K]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: K*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setConditions(value: js.Array[T]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: T*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPriority(value: integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  /** Filters URLs for constious criteria. See event filtering. All criteria are case sensitive. */
  trait UrlFilter extends StObject {
    
    /**
      * Matches if the host name of the URL contains a specified string.
      * To test whether a host name component has a prefix 'foo',
      * use hostContains: '.foo'. This matches 'www.foobar.com' and
      * 'foo.com', because an implicit dot is added at the beginning of
      * the host name. Similarly, hostContains can be used to match
      * against component suffix ('foo.') and to exactly match against
      * components ('.foo.'). Suffix- and exact-matching for the last
      * components need to be done separately using hostSuffix, because
      * no implicit dot is added at the end of the host name.
      **/
    var hostContains: js.UndefOr[String] = js.undefined
    
    /** Matches if the host name of the URL is equal to a specified string.  */
    var hostEquals: js.UndefOr[String] = js.undefined
    
    /** Matches if the host name of the URL starts with a specified string.  */
    var hostPrefix: js.UndefOr[String] = js.undefined
    
    /** Matches if the host name of the URL ends with a specified string.  */
    var hostSuffix: js.UndefOr[String] = js.undefined
    
    /**
      * Matches if the URL without query segment and fragment identifier matches a specified regular expression.
      * Port numbers are stripped from the URL if they match the default port number.
      * The regular expressions use the RE2 syntax.
      * @see[RE2 syntax docs]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
      * @since Chrome 28.
      */
    var originAndPathMatches: js.UndefOr[String] = js.undefined
    
    /** Matches if the path segment of the URL contains a specified string.  */
    var pathContains: js.UndefOr[String] = js.undefined
    
    /** Matches if the path segment of the URL starts with a specified string.  */
    var pathEquals: js.UndefOr[String] = js.undefined
    
    /** Matches if the path segment of the URL ends with a specified string.  */
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    /** Matches if the path segment of the URL is equal to a specified string.  */
    var pathSuffix: js.UndefOr[String] = js.undefined
    
    /**
      * Matches if the port of the URL is contained in any of the specified port lists.
      * For example [80, 443, [1000, 1200]] matches all requests on port 80, 443 and in the range 1000-1200.
      */
    var ports: js.UndefOr[js.Array[integer | js.Array[integer]]] = js.undefined
    
    /** Matches if the query segment of the URL contains a specified string.  */
    var queryContains: js.UndefOr[String] = js.undefined
    
    /** Matches if the query segment of the URL is equal to a specified string.  */
    var queryEquals: js.UndefOr[String] = js.undefined
    
    /** Matches if the query segment of the URL starts with a specified string.  */
    var queryPrefix: js.UndefOr[String] = js.undefined
    
    /** Matches if the query segment of the URL ends with a specified string.  */
    var querySuffix: js.UndefOr[String] = js.undefined
    
    /** Matches if the scheme of the URL is equal to any of the schemes specified in the array. */
    var schemes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlContains: js.UndefOr[String] = js.undefined
    
    /** Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlEquals: js.UndefOr[String] = js.undefined
    
    /** Matches if the URL (without fragment identifier) matches a specified regular expression.
      * Port numbers are stripped from the URL if they match the default port number.
      * The regular expressions use the RE2 syntax.
      * @see[RE2 syntax docs]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
      */
    var urlMatches: js.UndefOr[String] = js.undefined
    
    /** Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlPrefix: js.UndefOr[String] = js.undefined
    
    /** Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
    var urlSuffix: js.UndefOr[String] = js.undefined
  }
  object UrlFilter {
    
    inline def apply(): UrlFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlFilter] (val x: Self) extends AnyVal {
      
      inline def setHostContains(value: String): Self = StObject.set(x, "hostContains", value.asInstanceOf[js.Any])
      
      inline def setHostContainsUndefined: Self = StObject.set(x, "hostContains", js.undefined)
      
      inline def setHostEquals(value: String): Self = StObject.set(x, "hostEquals", value.asInstanceOf[js.Any])
      
      inline def setHostEqualsUndefined: Self = StObject.set(x, "hostEquals", js.undefined)
      
      inline def setHostPrefix(value: String): Self = StObject.set(x, "hostPrefix", value.asInstanceOf[js.Any])
      
      inline def setHostPrefixUndefined: Self = StObject.set(x, "hostPrefix", js.undefined)
      
      inline def setHostSuffix(value: String): Self = StObject.set(x, "hostSuffix", value.asInstanceOf[js.Any])
      
      inline def setHostSuffixUndefined: Self = StObject.set(x, "hostSuffix", js.undefined)
      
      inline def setOriginAndPathMatches(value: String): Self = StObject.set(x, "originAndPathMatches", value.asInstanceOf[js.Any])
      
      inline def setOriginAndPathMatchesUndefined: Self = StObject.set(x, "originAndPathMatches", js.undefined)
      
      inline def setPathContains(value: String): Self = StObject.set(x, "pathContains", value.asInstanceOf[js.Any])
      
      inline def setPathContainsUndefined: Self = StObject.set(x, "pathContains", js.undefined)
      
      inline def setPathEquals(value: String): Self = StObject.set(x, "pathEquals", value.asInstanceOf[js.Any])
      
      inline def setPathEqualsUndefined: Self = StObject.set(x, "pathEquals", js.undefined)
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPathSuffix(value: String): Self = StObject.set(x, "pathSuffix", value.asInstanceOf[js.Any])
      
      inline def setPathSuffixUndefined: Self = StObject.set(x, "pathSuffix", js.undefined)
      
      inline def setPorts(value: js.Array[integer | js.Array[integer]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      inline def setPortsVarargs(value: (integer | js.Array[integer])*): Self = StObject.set(x, "ports", js.Array(value*))
      
      inline def setQueryContains(value: String): Self = StObject.set(x, "queryContains", value.asInstanceOf[js.Any])
      
      inline def setQueryContainsUndefined: Self = StObject.set(x, "queryContains", js.undefined)
      
      inline def setQueryEquals(value: String): Self = StObject.set(x, "queryEquals", value.asInstanceOf[js.Any])
      
      inline def setQueryEqualsUndefined: Self = StObject.set(x, "queryEquals", js.undefined)
      
      inline def setQueryPrefix(value: String): Self = StObject.set(x, "queryPrefix", value.asInstanceOf[js.Any])
      
      inline def setQueryPrefixUndefined: Self = StObject.set(x, "queryPrefix", js.undefined)
      
      inline def setQuerySuffix(value: String): Self = StObject.set(x, "querySuffix", value.asInstanceOf[js.Any])
      
      inline def setQuerySuffixUndefined: Self = StObject.set(x, "querySuffix", js.undefined)
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
      
      inline def setUrlContains(value: String): Self = StObject.set(x, "urlContains", value.asInstanceOf[js.Any])
      
      inline def setUrlContainsUndefined: Self = StObject.set(x, "urlContains", js.undefined)
      
      inline def setUrlEquals(value: String): Self = StObject.set(x, "urlEquals", value.asInstanceOf[js.Any])
      
      inline def setUrlEqualsUndefined: Self = StObject.set(x, "urlEquals", js.undefined)
      
      inline def setUrlMatches(value: String): Self = StObject.set(x, "urlMatches", value.asInstanceOf[js.Any])
      
      inline def setUrlMatchesUndefined: Self = StObject.set(x, "urlMatches", js.undefined)
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
    }
  }
}
