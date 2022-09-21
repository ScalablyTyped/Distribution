package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySystem extends StObject {
  
  def getCDMData(): js.typedarray.ArrayBuffer | Null = js.native
  def getCDMData(cdmData: String): js.typedarray.ArrayBuffer | Null = js.native
  
  def getInitData(cp: js.Object): js.typedarray.ArrayBuffer = js.native
  
  def getLicenseRequestFromMessage(message: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = js.native
  
  def getLicenseServerURLFromInitData(initData: js.typedarray.ArrayBuffer): String | Null = js.native
  
  def getRequestHeadersFromMessage(message: js.typedarray.ArrayBuffer): js.Object | Null = js.native
  
  var schemeIdURI: String = js.native
  
  var systemString: String = js.native
  
  var uuid: String = js.native
}
