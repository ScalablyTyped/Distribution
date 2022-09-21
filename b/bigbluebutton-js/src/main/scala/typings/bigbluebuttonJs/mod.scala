package typings.bigbluebuttonJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bigbluebutton-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def api(host: String, salt: String): ApiType = (^.asInstanceOf[js.Dynamic].applyDynamic("api")(host.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[ApiType]
  inline def api(host: String, salt: String, options: js.Object): ApiType = (^.asInstanceOf[js.Dynamic].applyDynamic("api")(host.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ApiType]
  
  inline def http(url: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("http")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object util {
    
    @JSImport("bigbluebutton-js", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def constructUrl(options: js.Object, string: String, params: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constructUrl")(options.asInstanceOf[js.Any], string.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getPathname(url: String, host: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(url.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def httpClient(url: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("httpClient")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    // Axios
    inline def normalizeUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseXml(xml: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  trait AdministrationType extends StObject {
    
    def create(name: String, id: String, kwparams: js.Object): String
    
    def end(meetingID: String, password: String): String
    
    def join(fullName: String, meetingID: String, password: String, kwparams: js.Object): String
  }
  object AdministrationType {
    
    inline def apply(
      create: (String, String, js.Object) => String,
      end: (String, String) => String,
      join: (String, String, String, js.Object) => String
    ): AdministrationType = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), end = js.Any.fromFunction2(end), join = js.Any.fromFunction4(join))
      __obj.asInstanceOf[AdministrationType]
    }
    
    extension [Self <: AdministrationType](x: Self) {
      
      inline def setCreate(value: (String, String, js.Object) => String): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setEnd(value: (String, String) => String): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setJoin(value: (String, String, String, js.Object) => String): Self = StObject.set(x, "join", js.Any.fromFunction4(value))
    }
  }
  
  trait ApiType extends StObject {
    
    var administration: AdministrationType
    
    var hooks: HooksType
    
    var monitoring: MonitoringType
    
    var recording: RecordingType
  }
  object ApiType {
    
    inline def apply(
      administration: AdministrationType,
      hooks: HooksType,
      monitoring: MonitoringType,
      recording: RecordingType
    ): ApiType = {
      val __obj = js.Dynamic.literal(administration = administration.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiType]
    }
    
    extension [Self <: ApiType](x: Self) {
      
      inline def setAdministration(value: AdministrationType): Self = StObject.set(x, "administration", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: HooksType): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setMonitoring(value: MonitoringType): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setRecording(value: RecordingType): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
    }
  }
  
  trait HooksType extends StObject {
    
    def create(callbackURL: String, kwparams: js.Object): String
    
    def destroy(hookID: String, kwparams: js.Object): String
    
    def list(kwparams: js.Object): String
  }
  object HooksType {
    
    inline def apply(
      create: (String, js.Object) => String,
      destroy: (String, js.Object) => String,
      list: js.Object => String
    ): HooksType = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), destroy = js.Any.fromFunction2(destroy), list = js.Any.fromFunction1(list))
      __obj.asInstanceOf[HooksType]
    }
    
    extension [Self <: HooksType](x: Self) {
      
      inline def setCreate(value: (String, js.Object) => String): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: (String, js.Object) => String): Self = StObject.set(x, "destroy", js.Any.fromFunction2(value))
      
      inline def setList(value: js.Object => String): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    }
  }
  
  trait MonitoringType extends StObject {
    
    def getMeetingInfo(meetingID: String): String
    
    def getMeetings(): String
    
    def isMeetingRunning(meetingID: String): String
  }
  object MonitoringType {
    
    inline def apply(getMeetingInfo: String => String, getMeetings: () => String, isMeetingRunning: String => String): MonitoringType = {
      val __obj = js.Dynamic.literal(getMeetingInfo = js.Any.fromFunction1(getMeetingInfo), getMeetings = js.Any.fromFunction0(getMeetings), isMeetingRunning = js.Any.fromFunction1(isMeetingRunning))
      __obj.asInstanceOf[MonitoringType]
    }
    
    extension [Self <: MonitoringType](x: Self) {
      
      inline def setGetMeetingInfo(value: String => String): Self = StObject.set(x, "getMeetingInfo", js.Any.fromFunction1(value))
      
      inline def setGetMeetings(value: () => String): Self = StObject.set(x, "getMeetings", js.Any.fromFunction0(value))
      
      inline def setIsMeetingRunning(value: String => String): Self = StObject.set(x, "isMeetingRunning", js.Any.fromFunction1(value))
    }
  }
  
  trait RecordingType extends StObject {
    
    def deleteRecordings(recordID: String): String
    
    def getRecordings(kwparams: js.Object): String
    
    def publishRecordings(recordID: String, publish: String): String
    
    def updateRecordings(recordID: String, kwparams: js.Object): String
  }
  object RecordingType {
    
    inline def apply(
      deleteRecordings: String => String,
      getRecordings: js.Object => String,
      publishRecordings: (String, String) => String,
      updateRecordings: (String, js.Object) => String
    ): RecordingType = {
      val __obj = js.Dynamic.literal(deleteRecordings = js.Any.fromFunction1(deleteRecordings), getRecordings = js.Any.fromFunction1(getRecordings), publishRecordings = js.Any.fromFunction2(publishRecordings), updateRecordings = js.Any.fromFunction2(updateRecordings))
      __obj.asInstanceOf[RecordingType]
    }
    
    extension [Self <: RecordingType](x: Self) {
      
      inline def setDeleteRecordings(value: String => String): Self = StObject.set(x, "deleteRecordings", js.Any.fromFunction1(value))
      
      inline def setGetRecordings(value: js.Object => String): Self = StObject.set(x, "getRecordings", js.Any.fromFunction1(value))
      
      inline def setPublishRecordings(value: (String, String) => String): Self = StObject.set(x, "publishRecordings", js.Any.fromFunction2(value))
      
      inline def setUpdateRecordings(value: (String, js.Object) => String): Self = StObject.set(x, "updateRecordings", js.Any.fromFunction2(value))
    }
  }
}
