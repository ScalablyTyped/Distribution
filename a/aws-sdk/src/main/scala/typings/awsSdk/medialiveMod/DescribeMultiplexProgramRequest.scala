package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMultiplexProgramRequest extends StObject {
  
  /**
    * The ID of the multiplex that the program belongs to.
    */
  var MultiplexId: string = js.native
  
  /**
    * The name of the program.
    */
  var ProgramName: string = js.native
}
object DescribeMultiplexProgramRequest {
  
  @scala.inline
  def apply(MultiplexId: string, ProgramName: string): DescribeMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexProgramRequest]
  }
  
  @scala.inline
  implicit class DescribeMultiplexProgramRequestMutableBuilder[Self <: DescribeMultiplexProgramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
