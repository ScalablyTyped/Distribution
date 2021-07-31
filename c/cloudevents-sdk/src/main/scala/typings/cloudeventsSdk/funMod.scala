package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/fun", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def asBase64(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asBase64")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def asData(data: js.Any, contentType: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("asData")(data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def clone_(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def equalsOrThrow(v1: js.Any, v2: js.Any, t: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsOrThrow")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isBase64(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBinary(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBoolean(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDate(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDefined(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDefinedOrThrow(v: js.Any, t: js.Any): js.Function0[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedOrThrow")(v.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Boolean]]
  
  @scala.inline
  def isInteger(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(v: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isStringOrObjectOrThrow(v: js.Any, t: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrObjectOrThrow")(v.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isStringOrThrow(v: js.Any, t: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStringOrThrow")(v.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
