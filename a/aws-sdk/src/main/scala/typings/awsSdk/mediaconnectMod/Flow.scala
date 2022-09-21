package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flow extends StObject {
  
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.
    */
  var AvailabilityZone: string
  
  /**
    * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var EgressIp: js.UndefOr[string] = js.undefined
  
  /**
    * The entitlements in this flow.
    */
  var Entitlements: listOfEntitlement
  
  /**
    * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
    */
  var FlowArn: string
  
  var Maintenance: js.UndefOr[typings.awsSdk.mediaconnectMod.Maintenance] = js.undefined
  
  /**
    * The media streams that are associated with the flow. After you associate a media stream with a source, you can also associate it with outputs on the flow.
    */
  var MediaStreams: js.UndefOr[listOfMediaStream] = js.undefined
  
  /**
    * The name of the flow.
    */
  var Name: string
  
  /**
    * The outputs in this flow.
    */
  var Outputs: listOfOutput
  
  var Source: typings.awsSdk.mediaconnectMod.Source
  
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.undefined
  
  var Sources: js.UndefOr[listOfSource] = js.undefined
  
  /**
    * The current status of the flow.
    */
  var Status: typings.awsSdk.mediaconnectMod.Status
  
  /**
    * The VPC Interfaces for this flow.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.undefined
}
object Flow {
  
  inline def apply(
    AvailabilityZone: string,
    Entitlements: listOfEntitlement,
    FlowArn: string,
    Name: string,
    Outputs: listOfOutput,
    Source: Source,
    Status: Status
  ): Flow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  extension [Self <: Flow](x: Self) {
    
    inline def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEgressIp(value: string): Self = StObject.set(x, "EgressIp", value.asInstanceOf[js.Any])
    
    inline def setEgressIpUndefined: Self = StObject.set(x, "EgressIp", js.undefined)
    
    inline def setEntitlements(value: listOfEntitlement): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setMaintenance(value: Maintenance): Self = StObject.set(x, "Maintenance", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceUndefined: Self = StObject.set(x, "Maintenance", js.undefined)
    
    inline def setMediaStreams(value: listOfMediaStream): Self = StObject.set(x, "MediaStreams", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamsUndefined: Self = StObject.set(x, "MediaStreams", js.undefined)
    
    inline def setMediaStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "MediaStreams", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
    
    inline def setSources(value: listOfSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaces(value: listOfVpcInterface): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfacesUndefined: Self = StObject.set(x, "VpcInterfaces", js.undefined)
    
    inline def setVpcInterfacesVarargs(value: VpcInterface*): Self = StObject.set(x, "VpcInterfaces", js.Array(value*))
  }
}
