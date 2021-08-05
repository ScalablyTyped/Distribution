package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitEveryMod {
  
  @JSImport("@aws-sdk/smithy-client/dist/cjs/split-every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitEvery(value: String, delimiter: String, numDelimiters: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitEvery")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], numDelimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
