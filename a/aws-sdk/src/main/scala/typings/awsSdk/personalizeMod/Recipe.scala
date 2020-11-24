package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipe extends js.Object {
  
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
  implicit class RecipeOps[Self <: Recipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = this.set("algorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithmArn: Self = this.set("algorithmArn", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFeatureTransformationArn(value: Arn): Self = this.set("featureTransformationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureTransformationArn: Self = this.set("featureTransformationArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecipeArn(value: Arn): Self = this.set("recipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeArn: Self = this.set("recipeArn", js.undefined)
    
    @scala.inline
    def setRecipeType(value: RecipeType): Self = this.set("recipeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeType: Self = this.set("recipeType", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
