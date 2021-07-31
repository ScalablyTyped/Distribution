package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipe extends StObject {
  
  /**
    * The date and time that the recipe was created.
    */
  var CreateDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier (the user name) of the user who created the recipe.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The description of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.undefined
  
  /**
    * The identifier (user name) of the user who last modified the recipe.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The last modification date and time of the recipe.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The unique name for the recipe.
    */
  var Name: RecipeName
  
  /**
    * The name of the project that the recipe is associated with.
    */
  var ProjectName: js.UndefOr[typings.awsSdk.databrewMod.ProjectName] = js.undefined
  
  /**
    * The identifier (the user name) of the user who published the recipe.
    */
  var PublishedBy: js.UndefOr[typings.awsSdk.databrewMod.PublishedBy] = js.undefined
  
  /**
    * The date and time when the recipe was published.
    */
  var PublishedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The identifier for the version for the recipe. 
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the recipe.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A list of steps that are defined by the recipe.
    */
  var Steps: js.UndefOr[RecipeStepList] = js.undefined
  
  /**
    * Metadata tags that have been applied to the recipe.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Recipe {
  
  @scala.inline
  def apply(Name: RecipeName): Recipe = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipe]
  }
  
  @scala.inline
  implicit class RecipeMutableBuilder[Self <: Recipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    @scala.inline
    def setPublishedBy(value: PublishedBy): Self = StObject.set(x, "PublishedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedByUndefined: Self = StObject.set(x, "PublishedBy", js.undefined)
    
    @scala.inline
    def setPublishedDate(value: Date): Self = StObject.set(x, "PublishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDateUndefined: Self = StObject.set(x, "PublishedDate", js.undefined)
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
