package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashAdapter extends StObject {
  
  def getBandwidthForRepresentation(representationId: String, periodIdx: Double): Double = js.native
  
  def getIndexForRepresentation(representationId: String, periodIdx: Double): Double = js.native
  
  /**
    * This method returns the current max index based on what is defined in the MPD.
    *
    * @param bufferType String 'audio' or 'video',
    * @param periodIdx Make sure this is the period index not id
    */
  def getMaxIndexForBufferType(bufferType: MediaType, periodIdx: Double): Double = js.native
  
  def getMpd(): js.Object = js.native
  def getMpd(externalManifest: js.Object): js.Object = js.native
}
