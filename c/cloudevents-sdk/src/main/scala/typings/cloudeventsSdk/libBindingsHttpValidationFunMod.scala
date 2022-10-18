package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsHttpValidationFunMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/fun", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asBase64(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asBase64")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def asData(data: Any, contentType: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("asData")(data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def clone_(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def equalsOrThrow(v1: Any, v2: Any, t: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsOrThrow")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBase64(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinary(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefined(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefinedOrThrow(v: Any, t: Any): js.Function0[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedOrThrow")(v.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Boolean]]
  
  inline def isInteger(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStringOrObjectOrThrow(v: Any, t: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrObjectOrThrow")(v.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStringOrThrow(v: Any, t: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrThrow")(v.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
