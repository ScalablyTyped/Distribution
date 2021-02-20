package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipe extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  
  /**
    * The date and time (in Unix format) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The description of the recipe.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The ARN of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.native
  
  /**
    * The date and time (in Unix format) that the recipe was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the recipe.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the recipe.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  
  /**
    * One of the following values:   PERSONALIZED_RANKING   RELATED_ITEMS   USER_PERSONALIZATION  
    */
  var recipeType: js.UndefOr[RecipeType] = js.native
  
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.native
}
object Recipe {
  
  @scala.inline
  def apply(): Recipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipe]
  }
  
  @scala.inline
  implicit class RecipeMutableBuilder[Self <: Recipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = StObject.set(x, "algorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmArnUndefined: Self = StObject.set(x, "algorithmArn", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFeatureTransformationArn(value: Arn): Self = StObject.set(x, "featureTransformationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTransformationArnUndefined: Self = StObject.set(x, "featureTransformationArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeArnUndefined: Self = StObject.set(x, "recipeArn", js.undefined)
    
    @scala.inline
    def setRecipeType(value: RecipeType): Self = StObject.set(x, "recipeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeTypeUndefined: Self = StObject.set(x, "recipeType", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
