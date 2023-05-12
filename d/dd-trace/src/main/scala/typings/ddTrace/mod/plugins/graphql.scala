package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.anon.Execute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [graphql](https://github.com/graphql/graphql-js) module.
  *
  * The `graphql` integration uses the operation name as the span resource name.
  * If no operation name is set, the resource name will always be just `query`,
  * `mutation` or `subscription`.
  *
  * For example:
  *
  * ```graphql
  * # good, the resource name will be `query HelloWorld`
  * query HelloWorld {
  *   hello
  *   world
  * }
  *
  * # bad, the resource name will be `query`
  * {
  *   hello
  *   world
  * }
  * ```
  */
trait graphql
  extends StObject
     with Instrumentation {
  
  /**
    * Whether to collapse list items into a single element. (i.e. single
    * `users.*.name` span instead of `users.0.name`, `users.1.name`, etc)
    *
    * @default true
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum depth of fields/resolvers to instrument. Set to `0` to only
    * instrument the operation or to `-1` to instrument all fields/resolvers.
    *
    * @default -1
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * An object of optional callbacks to be executed during the respective
    * phase of a GraphQL operation. Undefined callbacks default to a noop
    * function.
    *
    * @default {}
    */
  var hooks: js.UndefOr[Execute] = js.undefined
  
  /**
    * Whether to enable signature calculation for the resource name. This can
    * be disabled if your GraphQL operations always have a name. Note that when
    * disabled all queries will need to be named for this to work properly.
    *
    * @default true
    */
  var signature: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include the source of the operation within the query as a tag
    * on every span. This may contain sensitive information and sould only be
    * enabled if sensitive data is always sent as variables and not in the
    * query text.
    *
    * @default false
    */
  var source: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of variable names to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var variables: js.UndefOr[
    js.Array[String] | (js.Function1[/* variables */ StringDictionary[Any], StringDictionary[Any]])
  ] = js.undefined
}
object graphql {
  
  inline def apply(): graphql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[graphql]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: graphql] (val x: Self) extends AnyVal {
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setHooks(value: Execute): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setSignature(value: Boolean): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVariables(
      value: js.Array[String] | (js.Function1[/* variables */ StringDictionary[Any], StringDictionary[Any]])
    ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesFunction1(value: /* variables */ StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "variables", js.Any.fromFunction1(value))
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
