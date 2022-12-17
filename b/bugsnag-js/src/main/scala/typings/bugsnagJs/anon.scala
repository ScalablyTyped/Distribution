package typings.bugsnagJs

import org.scalablytyped.runtime.StringDictionary
import typings.bugsnagJs.typesClientMod._NotifiableError
import typings.bugsnagJs.typesReportMod.IStackframe
import typings.bugsnagJs.typesReportMod.Report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var releaseStage: String
  }
  object Dictkey {
    
    inline def apply(releaseStage: String): Dictkey = {
      val __obj = js.Dynamic.literal(releaseStage = releaseStage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setReleaseStage(value: String): Self = StObject.set(x, "releaseStage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorClass
    extends StObject
       with _NotifiableError {
    
    var errorClass: String
    
    var errorMessage: String
  }
  object ErrorClass {
    
    inline def apply(errorClass: String, errorMessage: String): ErrorClass = {
      val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorClass]
    }
    
    extension [Self <: ErrorClass](x: Self) {
      
      inline def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Handled extends StObject {
    
    var _handled: Double
    
    var _unhandled: Double
  }
  object Handled {
    
    inline def apply(_handled: Double, _unhandled: Double): Handled = {
      val __obj = js.Dynamic.literal(_handled = _handled.asInstanceOf[js.Any], _unhandled = _unhandled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handled]
    }
    
    extension [Self <: Handled](x: Self) {
      
      inline def set_handled(value: Double): Self = StObject.set(x, "_handled", value.asInstanceOf[js.Any])
      
      inline def set_unhandled(value: Double): Self = StObject.set(x, "_unhandled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message
    extends StObject
       with _NotifiableError {
    
    var message: String
    
    var name: String
  }
  object Message {
    
    inline def apply(message: String, name: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var url: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, url: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Notify extends StObject {
    
    @JSName("notify")
    var notify_FNotify: String
    
    var sessions: String
  }
  object Notify {
    
    inline def apply(notify_ : String, sessions: String): Notify = {
      val __obj = js.Dynamic.literal(sessions = sessions.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notify]
    }
    
    extension [Self <: Notify](x: Self) {
      
      inline def setNotify_(value: String): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setSessions(value: String): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `type`: String
  }
  object Type {
    
    inline def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofReport extends StObject {
    
    /* static member */
    def ensureReport(reportOrError: Any): Report = js.native
    def ensureReport(reportOrError: Any, errorFramesToSkip: Double): Report = js.native
    def ensureReport(reportOrError: Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): Report = js.native
    def ensureReport(reportOrError: Any, errorFramesToSkip: Unit, generatedFramesToSkip: Double): Report = js.native
    
    /* static member */
    def getStacktrace(error: Any): js.Array[IStackframe] = js.native
    def getStacktrace(error: Any, errorFramesToSkip: Double): js.Array[IStackframe] = js.native
    def getStacktrace(error: Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
    def getStacktrace(error: Any, errorFramesToSkip: Unit, generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
