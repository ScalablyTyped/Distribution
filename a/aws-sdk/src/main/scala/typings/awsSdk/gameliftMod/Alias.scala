package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift alias ARN, the resource ID matches the alias ID value.
    */
  var AliasArn: js.UndefOr[typings.awsSdk.gameliftMod.AliasArn] = js.undefined
  
  /**
    * A unique identifier for an alias. Alias IDs are unique within a Region.
    */
  var AliasId: js.UndefOr[typings.awsSdk.gameliftMod.AliasId] = js.undefined
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A human-readable description of an alias.
    */
  var Description: js.UndefOr[FreeText] = js.undefined
  
  /**
    * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
  
  /**
    * The routing configuration, including routing type and fleet target, for the alias. 
    */
  var RoutingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.RoutingStrategy] = js.undefined
}
object Alias {
  
  @scala.inline
  def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasArn(value: AliasArn): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    @scala.inline
    def setAliasId(value: AliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: FreeText): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: NonBlankAndLengthConstraintString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoutingStrategy(value: RoutingStrategy): Self = StObject.set(x, "RoutingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingStrategyUndefined: Self = StObject.set(x, "RoutingStrategy", js.undefined)
  }
}
