package typings.depsRegex

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [matchInternal=true] a string property of SpecialType
    * @property {boolean} [matchES6=true] a string property of SpecialType
    * @property {boolean} [matchCoffeescript=true] a string property of SpecialType
    * @property {boolean} [matchGruntTask=true] a string property of SpecialType
    */
  /**
    * Regular expression for matching require statements.
    *
    * @param {Options} options A string param.
    */
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("deps-regex", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DepsRegex {
    /**
      * @typedef {Object} Options
      * @property {boolean} [matchInternal=true] a string property of SpecialType
      * @property {boolean} [matchES6=true] a string property of SpecialType
      * @property {boolean} [matchCoffeescript=true] a string property of SpecialType
      * @property {boolean} [matchGruntTask=true] a string property of SpecialType
      */
    /**
      * Regular expression for matching require statements.
      *
      * @param {Options} options A string param.
      */
    def this(options: Options) = this()
    
    /**
      * Executes a search on a string using the DepsRegex, and returns an array containing the results of that search.
      *
      * @param {string} string The String object or string literal on which to perform the search.
      */
    /* CompleteClass */
    override def exec(string: String): RegExpExecArray = js.native
    
    /**
      * Returns an array of strings containing the require statements in a searched string.
      *
      * @param {string} string The String object or string literal on which to perform the search.
      */
    /* CompleteClass */
    override def getDependencies(string: String): js.Array[String] = js.native
    
    /** @private */
    /* private */ /* CompleteClass */
    var regex: Any = js.native
    
    /**
      * Returns a Boolean value that indicates whether or not there is a require statement in a searched string.
      *
      * @param {string} string The String object or string literal on which to perform the search.
      */
    /* CompleteClass */
    override def test(string: String): Boolean = js.native
  }
  @JSImport("deps-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DepsRegex extends StObject {
    
    /**
      * Executes a search on a string using the DepsRegex, and returns an array containing the results of that search.
      *
      * @param {string} string The String object or string literal on which to perform the search.
      */
    def exec(string: String): RegExpExecArray
    
    /**
      * Returns an array of strings containing the require statements in a searched string.
      *
      * @param {string} string The String object or string literal on which to perform the search.
      */
    def getDependencies(string: String): js.Array[String]
    
    /** @private */
    /* private */ var regex: Any
    
    /**
      * Returns a Boolean value that indicates whether or not there is a require statement in a searched string.
      *
      * @param {string} string The String object or string literal on which to perform the search.
      */
    def test(string: String): Boolean
  }
  object DepsRegex {
    
    inline def apply(
      exec: String => RegExpExecArray,
      getDependencies: String => js.Array[String],
      regex: Any,
      test: String => Boolean
    ): DepsRegex = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), getDependencies = js.Any.fromFunction1(getDependencies), regex = regex.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[DepsRegex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DepsRegex] (val x: Self) extends AnyVal {
      
      inline def setExec(value: String => RegExpExecArray): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
      
      inline def setGetDependencies(value: String => js.Array[String]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction1(value))
      
      inline def setRegex(value: Any): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * a string property of SpecialType
      */
    var matchCoffeescript: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a string property of SpecialType
      */
    var matchES6: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a string property of SpecialType
      */
    var matchGruntTask: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a string property of SpecialType
      */
    var matchInternal: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMatchCoffeescript(value: Boolean): Self = StObject.set(x, "matchCoffeescript", value.asInstanceOf[js.Any])
      
      inline def setMatchCoffeescriptUndefined: Self = StObject.set(x, "matchCoffeescript", js.undefined)
      
      inline def setMatchES6(value: Boolean): Self = StObject.set(x, "matchES6", value.asInstanceOf[js.Any])
      
      inline def setMatchES6Undefined: Self = StObject.set(x, "matchES6", js.undefined)
      
      inline def setMatchGruntTask(value: Boolean): Self = StObject.set(x, "matchGruntTask", value.asInstanceOf[js.Any])
      
      inline def setMatchGruntTaskUndefined: Self = StObject.set(x, "matchGruntTask", js.undefined)
      
      inline def setMatchInternal(value: Boolean): Self = StObject.set(x, "matchInternal", value.asInstanceOf[js.Any])
      
      inline def setMatchInternalUndefined: Self = StObject.set(x, "matchInternal", js.undefined)
    }
  }
}
