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
  var ProducerTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The timestamp from the AWS server corresponding to the fragment.
    */
  var ServerTimestamp: js.UndefOr[Timestamp] = js.undefined
}
object Fragment {
  
  @scala.inline
  def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragmentLengthInMilliseconds(value: Long): Self = StObject.set(x, "FragmentLengthInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentLengthInMillisecondsUndefined: Self = StObject.set(x, "FragmentLengthInMilliseconds", js.undefined)
    
    @scala.inline
    def setFragmentNumber(value: FragmentNumberString): Self = StObject.set(x, "FragmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentNumberUndefined: Self = StObject.set(x, "FragmentNumber", js.undefined)
    
    @scala.inline
    def setFragmentSizeInBytes(value: Long): Self = StObject.set(x, "FragmentSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentSizeInBytesUndefined: Self = StObject.set(x, "FragmentSizeInBytes", js.undefined)
    
    @scala.inline
    def setProducerTimestamp(value: Timestamp): Self = StObject.set(x, "ProducerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerTimestampUndefined: Self = StObject.set(x, "ProducerTimestamp", js.undefined)
    
    @scala.inline
    def setServerTimestamp(value: Timestamp): Self = StObject.set(x, "ServerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTimestampUndefined: Self = StObject.set(x, "ServerTimestamp", js.undefined)
  }
}
