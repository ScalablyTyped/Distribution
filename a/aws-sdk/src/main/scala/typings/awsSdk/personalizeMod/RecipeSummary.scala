package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipeSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The date and time (in Unix time) that the recipe was last updated.
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
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.native
}

object RecipeSummary {
  @scala.inline
  def apply(): RecipeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeSummary]
  }
  @scala.inline
  implicit class RecipeSummaryOps[Self <: RecipeSummary] (val x: Self) extends AnyVal {
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
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
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
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

