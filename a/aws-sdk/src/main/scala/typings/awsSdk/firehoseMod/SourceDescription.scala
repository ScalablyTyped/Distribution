package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDescription extends StObject {
  
  /**
    * The KinesisStreamSourceDescription value for the source Kinesis data stream.
    */
  var KinesisStreamSourceDescription: js.UndefOr[typings.awsSdk.firehoseMod.KinesisStreamSourceDescription] = js.undefined
}
object SourceDescription {
  
  inline def apply(): SourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDescription]
  }
  
  extension [Self <: SourceDescription](x: Self) {
    
    inline def setKinesisStreamSourceDescription(value: KinesisStreamSourceDescription): Self = StObject.set(x, "KinesisStreamSourceDescription", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamSourceDescriptionUndefined: Self = StObject.set(x, "KinesisStreamSourceDescription", js.undefined)
  }
}
