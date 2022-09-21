package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRouteCalculatorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource across AWS.   Format example: arn:aws:geo:region:account-id:route-calculator/ExampleCalculator   
    */
  var CalculatorArn: Arn
  
  /**
    * The name of the route calculator resource being described.
    */
  var CalculatorName: ResourceName
  
  /**
    * The timestamp when the route calculator resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.    For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var CreateTime: js.Date
  
  /**
    * The data provider of traffic and road network data. Indicates one of the available providers:    Esri     Here    For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The optional description of the route calculator resource.
    */
  var Description: ResourceDescription
  
  /**
    * Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.locationMod.PricingPlan] = js.undefined
  
  /**
    * Tags associated with route calculator resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The timestamp when the route calculator resource was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.    For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var UpdateTime: js.Date
}
object DescribeRouteCalculatorResponse {
  
  inline def apply(
    CalculatorArn: Arn,
    CalculatorName: ResourceName,
    CreateTime: js.Date,
    DataSource: String,
    Description: ResourceDescription,
    UpdateTime: js.Date
  ): DescribeRouteCalculatorResponse = {
    val __obj = js.Dynamic.literal(CalculatorArn = CalculatorArn.asInstanceOf[js.Any], CalculatorName = CalculatorName.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRouteCalculatorResponse]
  }
  
  extension [Self <: DescribeRouteCalculatorResponse](x: Self) {
    
    inline def setCalculatorArn(value: Arn): Self = StObject.set(x, "CalculatorArn", value.asInstanceOf[js.Any])
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
