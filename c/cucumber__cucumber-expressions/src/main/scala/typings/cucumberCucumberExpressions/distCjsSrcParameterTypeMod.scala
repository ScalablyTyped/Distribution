package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcParameterTypeMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/ParameterType", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ParameterType[T] {
    def this(
      name: String,
      regexps: RegExps,
      `type`: Null,
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    /**
      * @param name {String} the name of the type
      * @param regexps {Array.<RegExp | String>,RegExp,String} that matche the type
      * @param type {Function} the prototype (constructor) of the type. May be null.
      * @param transform {Function} function transforming string to another type. May be null.
      * @param useForSnippets {boolean} true if this should be used for snippets. Defaults to true.
      * @param preferForRegexpMatch {boolean} true if this is a preferential type. Defaults to false.
      */
    def this(
      name: String,
      regexps: RegExps,
      `type`: Constructor[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: String,
      regexps: RegExps,
      `type`: Factory[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Null,
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Constructor[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Factory[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/ParameterType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkParameterTypeName(typeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkParameterTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def compare(pt1: ParameterType[Any], pt2: ParameterType[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isValidParameterTypeName(typeName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameterTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait Constructor[T]
    extends js.Function
       with Instantiable1[/* args (repeated) */ Any, T]
  
  @js.native
  trait Factory[T] extends StObject {
    
    def apply(args: Any*): T = js.native
  }
  
  @js.native
  trait ParameterType[T] extends StObject {
    
    val name: js.UndefOr[String] = js.native
    
    val preferForRegexpMatch: Boolean = js.native
    
    var regexpStrings: js.Array[String] = js.native
    
    def transform(thisObj: Any): Any = js.native
    def transform(thisObj: Any, groupValues: js.Array[String]): Any = js.native
    
    /* private */ var transformFn: Any = js.native
    
    val `type`: Constructor[T] | Factory[T] | Null = js.native
    
    val useForSnippets: Boolean = js.native
  }
  
  type RegExps = StringOrRegExp | js.Array[StringOrRegExp]
  
  type StringOrRegExp = String | js.RegExp
}
