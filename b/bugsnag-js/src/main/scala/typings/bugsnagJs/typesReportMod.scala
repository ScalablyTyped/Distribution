package typings.bugsnagJs

import typings.bugsnagJs.anon.Dictkey
import typings.bugsnagJs.anon.Type
import typings.bugsnagJs.anon.Url
import typings.bugsnagJs.bugsnagJsStrings.error
import typings.bugsnagJs.bugsnagJsStrings.info
import typings.bugsnagJs.bugsnagJsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReportMod {
  
  @JSImport("bugsnag-js/types/report", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Report {
    def this(errorClass: String, errorMessage: String) = this()
    def this(errorClass: String, errorMessage: String, stacktrace: js.Array[Any]) = this()
    def this(errorClass: String, errorMessage: String, stacktrace: js.Array[Any], handledState: IHandledState) = this()
    def this(errorClass: String, errorMessage: String, stacktrace: Unit, handledState: IHandledState) = this()
  }
  object default {
    
    @JSImport("bugsnag-js/types/report", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def ensureReport(reportOrError: Any): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureReport")(reportOrError.asInstanceOf[js.Any]).asInstanceOf[Report]
    inline def ensureReport(reportOrError: Any, errorFramesToSkip: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureReport")(reportOrError.asInstanceOf[js.Any], errorFramesToSkip.asInstanceOf[js.Any])).asInstanceOf[Report]
    inline def ensureReport(reportOrError: Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureReport")(reportOrError.asInstanceOf[js.Any], errorFramesToSkip.asInstanceOf[js.Any], generatedFramesToSkip.asInstanceOf[js.Any])).asInstanceOf[Report]
    inline def ensureReport(reportOrError: Any, errorFramesToSkip: Unit, generatedFramesToSkip: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureReport")(reportOrError.asInstanceOf[js.Any], errorFramesToSkip.asInstanceOf[js.Any], generatedFramesToSkip.asInstanceOf[js.Any])).asInstanceOf[Report]
    
    /* static member */
    inline def getStacktrace(error: Any): js.Array[IStackframe] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStacktrace")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[IStackframe]]
    inline def getStacktrace(error: Any, errorFramesToSkip: Double): js.Array[IStackframe] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStacktrace")(error.asInstanceOf[js.Any], errorFramesToSkip.asInstanceOf[js.Any])).asInstanceOf[js.Array[IStackframe]]
    inline def getStacktrace(error: Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): js.Array[IStackframe] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStacktrace")(error.asInstanceOf[js.Any], errorFramesToSkip.asInstanceOf[js.Any], generatedFramesToSkip.asInstanceOf[js.Any])).asInstanceOf[js.Array[IStackframe]]
    inline def getStacktrace(error: Any, errorFramesToSkip: Unit, generatedFramesToSkip: Double): js.Array[IStackframe] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStacktrace")(error.asInstanceOf[js.Any], errorFramesToSkip.asInstanceOf[js.Any], generatedFramesToSkip.asInstanceOf[js.Any])).asInstanceOf[js.Array[IStackframe]]
  }
  
  trait IHandledState extends StObject {
    
    var severity: String
    
    var severityReason: Type
    
    var unhandled: Boolean
  }
  object IHandledState {
    
    inline def apply(severity: String, severityReason: Type, unhandled: Boolean): IHandledState = {
      val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], severityReason = severityReason.asInstanceOf[js.Any], unhandled = unhandled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandledState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHandledState] (val x: Self) extends AnyVal {
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityReason(value: Type): Self = StObject.set(x, "severityReason", value.asInstanceOf[js.Any])
      
      inline def setUnhandled(value: Boolean): Self = StObject.set(x, "unhandled", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStackframe extends StObject {
    
    var code: js.UndefOr[js.Object] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var file: String
    
    var inProject: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
  }
  object IStackframe {
    
    inline def apply(file: String): IStackframe = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStackframe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStackframe] (val x: Self) extends AnyVal {
      
      inline def setCode(value: js.Object): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setInProject(value: Boolean): Self = StObject.set(x, "inProject", value.asInstanceOf[js.Any])
      
      inline def setInProjectUndefined: Self = StObject.set(x, "inProject", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait Report extends StObject {
    
    var apiKey: String = js.native
    
    var app: Dictkey = js.native
    
    var breadcrumbs: js.Array[typings.bugsnagJs.typesBreadcrumbMod.default] = js.native
    
    var context: String = js.native
    
    var device: js.Object = js.native
    
    var errorClass: String = js.native
    
    var errorMessage: String = js.native
    
    var groupingHash: String = js.native
    
    def ignore(): Unit = js.native
    
    def isIgnored(): Boolean = js.native
    
    var metaData: js.Object = js.native
    
    def removeMetaData(section: String, property: String): Report = js.native
    
    var request: Url = js.native
    
    var session: js.Object = js.native
    
    var severity: info | warning | error = js.native
    
    var stacktrace: js.Array[IStackframe] = js.native
    
    def updateMetaData(section: String, property: String, value: js.Object): Report = js.native
    def updateMetaData(section: String, value: js.Object): Report = js.native
    
    var user: js.Object = js.native
  }
}
