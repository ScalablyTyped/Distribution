package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the alias.
    */
  var AliasArn: js.UndefOr[FunctionArn] = js.native
  
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.native
  
  /**
    * The name of the alias.
    */
  var Name: js.UndefOr[Alias] = js.native
  
  /**
    * A unique identifier that changes when you update the alias.
    */
  var RevisionId: js.UndefOr[String] = js.native
  
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.native
}
object AliasConfiguration {
  
  @scala.inline
  def apply(): AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasConfiguration]
  }
  
  @scala.inline
  implicit class AliasConfigurationMutableBuilder[Self <: AliasConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasArn(value: FunctionArn): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFunctionVersion(value: Version): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
    
    @scala.inline
    def setName(value: Alias): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setRoutingConfig(value: AliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
  }
}
