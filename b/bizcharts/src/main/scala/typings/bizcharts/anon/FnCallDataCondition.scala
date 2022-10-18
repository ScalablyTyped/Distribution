package typings.bizcharts.anon

import typings.antvUtil.libLodashGroupByMod.ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallDataCondition extends StObject {
  
  def apply[T](data: js.Array[T], condition: String): ObjectType[T] = js.native
  def apply[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = js.native
}
