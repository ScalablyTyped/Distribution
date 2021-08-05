package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCommand extends StObject {
  
  /**
    * The name of the job command. For an Apache Spark ETL job, this must be glueetl. For a Python shell job, it must be pythonshell. For an Apache Spark streaming ETL job, this must be gluestreaming.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var PythonVersion: js.UndefOr[PythonVersionString] = js.undefined
  
  /**
    * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
    */
  var ScriptLocation: js.UndefOr[ScriptLocationString] = js.undefined
}
object JobCommand {
  
  inline def apply(): JobCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobCommand]
  }
  
  extension [Self <: JobCommand](x: Self) {
    
    inline def setName(value: GenericString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPythonVersion(value: PythonVersionString): Self = StObject.set(x, "PythonVersion", value.asInstanceOf[js.Any])
    
    inline def setPythonVersionUndefined: Self = StObject.set(x, "PythonVersion", js.undefined)
    
    inline def setScriptLocation(value: ScriptLocationString): Self = StObject.set(x, "ScriptLocation", value.asInstanceOf[js.Any])
    
    inline def setScriptLocationUndefined: Self = StObject.set(x, "ScriptLocation", js.undefined)
  }
}
