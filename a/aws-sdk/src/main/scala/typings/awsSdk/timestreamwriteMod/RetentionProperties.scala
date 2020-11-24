package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetentionProperties extends js.Object {
  
  /**
    * The duration for which data must be stored in the magnetic store. 
    */
  var MagneticStoreRetentionPeriodInDays: typings.awsSdk.timestreamwriteMod.MagneticStoreRetentionPeriodInDays = js.native
  
  /**
    * The duration for which data must be stored in the memory store. 
    */
  var MemoryStoreRetentionPeriodInHours: typings.awsSdk.timestreamwriteMod.MemoryStoreRetentionPeriodInHours = js.native
}
object RetentionProperties {
  
  @scala.inline
  def apply(
    MagneticStoreRetentionPeriodInDays: MagneticStoreRetentionPeriodInDays,
    MemoryStoreRetentionPeriodInHours: MemoryStoreRetentionPeriodInHours
  ): RetentionProperties = {
    val __obj = js.Dynamic.literal(MagneticStoreRetentionPeriodInDays = MagneticStoreRetentionPeriodInDays.asInstanceOf[js.Any], MemoryStoreRetentionPeriodInHours = MemoryStoreRetentionPeriodInHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionProperties]
  }
  
  @scala.inline
  implicit class RetentionPropertiesOps[Self <: RetentionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMagneticStoreRetentionPeriodInDays(value: MagneticStoreRetentionPeriodInDays): Self = this.set("MagneticStoreRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryStoreRetentionPeriodInHours(value: MemoryStoreRetentionPeriodInHours): Self = this.set("MemoryStoreRetentionPeriodInHours", value.asInstanceOf[js.Any])
  }
}
