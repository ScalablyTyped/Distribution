package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineController extends StObject {
  
  def createRecord(manifestURL: String): js.Promise[String]
  
  def deleteRecord(id: String): Unit
  
  def getAllRecords(): js.Array[OfflineRecord]
  
  def getRecordProgression(id: String): Double
  
  def loadRecordsFromStorage(): js.Promise[Unit]
  
  def reset(): Unit
  
  def resetRecords(): Unit
  
  def resumeRecord(id: String): Unit
  
  def startRecord(id: String, mediaInfos: js.Array[MediaInfo]): Unit
  
  def stopRecord(id: String): Unit
}
object OfflineController {
  
  inline def apply(
    createRecord: String => js.Promise[String],
    deleteRecord: String => Unit,
    getAllRecords: () => js.Array[OfflineRecord],
    getRecordProgression: String => Double,
    loadRecordsFromStorage: () => js.Promise[Unit],
    reset: () => Unit,
    resetRecords: () => Unit,
    resumeRecord: String => Unit,
    startRecord: (String, js.Array[MediaInfo]) => Unit,
    stopRecord: String => Unit
  ): OfflineController = {
    val __obj = js.Dynamic.literal(createRecord = js.Any.fromFunction1(createRecord), deleteRecord = js.Any.fromFunction1(deleteRecord), getAllRecords = js.Any.fromFunction0(getAllRecords), getRecordProgression = js.Any.fromFunction1(getRecordProgression), loadRecordsFromStorage = js.Any.fromFunction0(loadRecordsFromStorage), reset = js.Any.fromFunction0(reset), resetRecords = js.Any.fromFunction0(resetRecords), resumeRecord = js.Any.fromFunction1(resumeRecord), startRecord = js.Any.fromFunction2(startRecord), stopRecord = js.Any.fromFunction1(stopRecord))
    __obj.asInstanceOf[OfflineController]
  }
  
  extension [Self <: OfflineController](x: Self) {
    
    inline def setCreateRecord(value: String => js.Promise[String]): Self = StObject.set(x, "createRecord", js.Any.fromFunction1(value))
    
    inline def setDeleteRecord(value: String => Unit): Self = StObject.set(x, "deleteRecord", js.Any.fromFunction1(value))
    
    inline def setGetAllRecords(value: () => js.Array[OfflineRecord]): Self = StObject.set(x, "getAllRecords", js.Any.fromFunction0(value))
    
    inline def setGetRecordProgression(value: String => Double): Self = StObject.set(x, "getRecordProgression", js.Any.fromFunction1(value))
    
    inline def setLoadRecordsFromStorage(value: () => js.Promise[Unit]): Self = StObject.set(x, "loadRecordsFromStorage", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetRecords(value: () => Unit): Self = StObject.set(x, "resetRecords", js.Any.fromFunction0(value))
    
    inline def setResumeRecord(value: String => Unit): Self = StObject.set(x, "resumeRecord", js.Any.fromFunction1(value))
    
    inline def setStartRecord(value: (String, js.Array[MediaInfo]) => Unit): Self = StObject.set(x, "startRecord", js.Any.fromFunction2(value))
    
    inline def setStopRecord(value: String => Unit): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1(value))
  }
}
