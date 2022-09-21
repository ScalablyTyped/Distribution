package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fragment extends StObject {
  
  /**
    * The playback duration or other time value associated with the fragment.
    */
  var FragmentLengthInMilliseconds: js.UndefOr[Long] = js.undefined
  
  /**
    * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
    */
  var FragmentNumber: js.UndefOr[FragmentNumberString] = js.undefined
  
  /**
    * The total fragment size, including information about the fragment and contained media data.
    */
  var FragmentSizeInBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The timestamp from the producer corresponding to the fragment.
    */
  var ProducerTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp from the AWS server corresponding to the fragment.
    */
  var ServerTimestamp: js.UndefOr[js.Date] = js.undefined
}
object Fragment {
  
  inline def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  
  extension [Self <: Fragment](x: Self) {
    
    inline def setFragmentLengthInMilliseconds(value: Long): Self = StObject.set(x, "FragmentLengthInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setFragmentLengthInMillisecondsUndefined: Self = StObject.set(x, "FragmentLengthInMilliseconds", js.undefined)
    
    inline def setFragmentNumber(value: FragmentNumberString): Self = StObject.set(x, "FragmentNumber", value.asInstanceOf[js.Any])
    
    inline def setFragmentNumberUndefined: Self = StObject.set(x, "FragmentNumber", js.undefined)
    
    inline def setFragmentSizeInBytes(value: Long): Self = StObject.set(x, "FragmentSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setFragmentSizeInBytesUndefined: Self = StObject.set(x, "FragmentSizeInBytes", js.undefined)
    
    inline def setProducerTimestamp(value: js.Date): Self = StObject.set(x, "ProducerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setProducerTimestampUndefined: Self = StObject.set(x, "ProducerTimestamp", js.undefined)
    
    inline def setServerTimestamp(value: js.Date): Self = StObject.set(x, "ServerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setServerTimestampUndefined: Self = StObject.set(x, "ServerTimestamp", js.undefined)
  }
}
