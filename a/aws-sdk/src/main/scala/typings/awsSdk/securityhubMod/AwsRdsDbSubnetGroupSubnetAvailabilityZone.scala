package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSubnetGroupSubnetAvailabilityZone extends StObject {
  
  /**
    * The name of the Availability Zone for a subnet in the subnet group.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSubnetGroupSubnetAvailabilityZone {
  
  @scala.inline
  def apply(): AwsRdsDbSubnetGroupSubnetAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroupSubnetAvailabilityZone]
  }
  
  @scala.inline
  implicit class AwsRdsDbSubnetGroupSubnetAvailabilityZoneMutableBuilder[Self <: AwsRdsDbSubnetGroupSubnetAvailabilityZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
