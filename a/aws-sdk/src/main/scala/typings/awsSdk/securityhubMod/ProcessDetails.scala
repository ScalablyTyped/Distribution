package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessDetails extends StObject {
  
  /**
    * Indicates when the process was launched. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the process.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The parent process ID.
    */
  var ParentPid: js.UndefOr[Integer] = js.undefined
  
  /**
    * The path to the process executable.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The process ID.
    */
  var Pid: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates when the process was terminated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var TerminatedAt: js.UndefOr[NonEmptyString] = js.undefined
}
object ProcessDetails {
  
  inline def apply(): ProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessDetails]
  }
  
  extension [Self <: ProcessDetails](x: Self) {
    
    inline def setLaunchedAt(value: NonEmptyString): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParentPid(value: Integer): Self = StObject.set(x, "ParentPid", value.asInstanceOf[js.Any])
    
    inline def setParentPidUndefined: Self = StObject.set(x, "ParentPid", js.undefined)
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPid(value: Integer): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
    
    inline def setTerminatedAt(value: NonEmptyString): Self = StObject.set(x, "TerminatedAt", value.asInstanceOf[js.Any])
    
    inline def setTerminatedAtUndefined: Self = StObject.set(x, "TerminatedAt", js.undefined)
  }
}
