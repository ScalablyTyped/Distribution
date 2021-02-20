package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  /**
    * The component that will be subject to logging.
    */
  var Component: LoggerComponent = js.native
  
  /**
    * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string = js.native
  
  /**
    * The level of the logs.
    */
  var Level: LoggerLevel = js.native
  
  /**
    * The amount of file space, in KB, to use if the local file system is used for logging purposes.
    */
  var Space: js.UndefOr[integer] = js.native
  
  /**
    * The type of log output which will be used.
    */
  var Type: LoggerType = js.native
}
object Logger {
  
  @scala.inline
  def apply(Component: LoggerComponent, Id: string, Level: LoggerLevel, Type: LoggerType): Logger = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: LoggerComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LoggerLevel): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: integer): Self = StObject.set(x, "Space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "Space", js.undefined)
    
    @scala.inline
    def setType(value: LoggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
