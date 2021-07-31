package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getArrayIfSingleItemMod {
  
  @JSImport("@aws-sdk/smithy-client/dist/cjs/get-array-if-single-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getArrayIfSingleItem[T](mayBeArray: T): T | js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrayIfSingleItem")(mayBeArray.asInstanceOf[js.Any]).asInstanceOf[T | js.Array[T]]
}
