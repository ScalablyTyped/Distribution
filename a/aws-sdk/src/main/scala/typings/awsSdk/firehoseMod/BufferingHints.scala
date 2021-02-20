package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferingHints extends StObject {
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300. This parameter is optional but if you specify a value for it, you must also specify a value for SizeInMBs, and vice versa.
    */
  var IntervalInSeconds: js.UndefOr[typings.awsSdk.firehoseMod.IntervalInSeconds] = js.native
  
  /**
    * Buffer incoming data to the specified size, in MiBs, before delivering it to the destination. The default value is 5. This parameter is optional but if you specify a value for it, you must also specify a value for IntervalInSeconds, and vice versa. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MiB/sec, the value should be 10 MiB or higher.
    */
  var SizeInMBs: js.UndefOr[typings.awsSdk.firehoseMod.SizeInMBs] = js.native
}
object BufferingHints {
  
  @scala.inline
  def apply(): BufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingHints]
  }
  
  @scala.inline
  implicit class BufferingHintsMutableBuilder[Self <: BufferingHints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntervalInSeconds(value: IntervalInSeconds): Self = StObject.set(x, "IntervalInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalInSecondsUndefined: Self = StObject.set(x, "IntervalInSeconds", js.undefined)
    
    @scala.inline
    def setSizeInMBs(value: SizeInMBs): Self = StObject.set(x, "SizeInMBs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInMBsUndefined: Self = StObject.set(x, "SizeInMBs", js.undefined)
  }
}
