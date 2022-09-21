package typings.crocks

import typings.crocks.predMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicatesMod {
  
  @JSImport("crocks/predicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasProp(prop: String): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def hasProp(prop: String, `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProp(prop: Double): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def hasProp(prop: Double, `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasPropPath(path: js.Array[String | Double]): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPropPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def hasPropPath(path: js.Array[String | Double], `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPropPath")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasProps(props: js.Array[String | Double]): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def hasProps(props: js.Array[String | Double], `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProps")(props.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAlt(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlt")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAlternative(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlternative")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isApplicative(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApplicative")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isApply(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApply")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArray(`val`: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBifunctor(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBifunctor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(`val`: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isCategory(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCategory")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isChain(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChain")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isContravariant(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContravariant")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(`val`: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDefined(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExtend(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtend")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFalse(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFalsy(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsy")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFoldable(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFoldable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * isFunction :: a -> Boolean
    */
  inline def isFunction(`val`: Any): /* is crocks.crocks/predicates/isFunction.Fn */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is crocks.crocks/predicates/isFunction.Fn */ Boolean]
  
  inline def isFunctor(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInteger(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIterable(`val`: Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]
  
  inline def isMap(`val`: Any): /* is std.Map<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<any, any> */ Boolean]
  
  inline def isMonad(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonad")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMonoid(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonoid")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(`val`: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPlus(`val`: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlus")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isProfunctor(`val`: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProfunctor")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isPromise(`val`: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  inline def isSame(val1: Any): js.Function1[/* val2 */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(val1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val2 */ Any, Boolean]]
  inline def isSame(val1: Any, val2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameType(val1: Any): js.Function1[/* val2 */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameType")(val1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val2 */ Any, Boolean]]
  inline def isSameType(val1: Any, val2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameType")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSemigroup(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemigroup")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSemigroupoid(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemigroupoid")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSetoid(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetoid")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(`val`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSymbol(`val`: Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  inline def isTraversable(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTraversable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTrue(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTruthy(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTruthy")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pathEq(path: js.Array[String | Double]): js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathEq")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]]]
  inline def pathEq(path: js.Array[String | Double], `val`: Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathEq")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def pathEq(path: js.Array[String | Double], `val`: Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathEq")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pathSatisfies(path: js.Array[String | Double]): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def pathSatisfies(path: js.Array[String | Double], pred: js.Function1[/* val */ Any, Boolean | default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def pathSatisfies(
    path: js.Array[String | Double],
    pred: js.Function1[/* val */ Any, Boolean | default],
    obj: js.Object
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def propEq(prop: String): js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]]]
  inline def propEq(prop: String, `val`: Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def propEq(prop: String, `val`: Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def propEq(prop: Double): js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]]]
  inline def propEq(prop: Double, `val`: Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def propEq(prop: Double, `val`: Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def propSatisfies(prop: String): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def propSatisfies(prop: String, pred: js.Function1[/* val */ Any, Boolean | default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  /**
    * propSatisfies :: (String | Integer) -> ((a -> Boolean) | Pred) -> Object -> Boolean
    */
  inline def propSatisfies(prop: String, pred: js.Function1[/* val */ Any, Boolean | default], obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def propSatisfies(prop: Double): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def propSatisfies(prop: Double, pred: js.Function1[/* val */ Any, Boolean | default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def propSatisfies(prop: Double, pred: js.Function1[/* val */ Any, Boolean | default], obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
