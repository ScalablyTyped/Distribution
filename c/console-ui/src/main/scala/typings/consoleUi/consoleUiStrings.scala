package typings.consoleUi

import typings.consoleUi.mod.WriteLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleUiStrings {
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with WriteLevel
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with WriteLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO
    extends StObject
       with WriteLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait WARNING
    extends StObject
       with WriteLevel
  inline def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
}
