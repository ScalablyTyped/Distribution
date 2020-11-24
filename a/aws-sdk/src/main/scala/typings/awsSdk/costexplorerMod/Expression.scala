package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression extends js.Object {
  
  /**
    * Return results that match both Dimension objects.
    */
  var And: js.UndefOr[Expressions] = js.native
  
  /**
    * The filter based on CostCategory values.
    */
  var CostCategories: js.UndefOr[CostCategoryValues] = js.native
  
  /**
    * The specific Dimension to use for Expression.
    */
  var Dimensions: js.UndefOr[DimensionValues] = js.native
  
  /**
    * Return results that don't match a Dimension object.
    */
  var Not: js.UndefOr[Expression] = js.native
  
  /**
    * Return results that match either Dimension object.
    */
  var Or: js.UndefOr[Expressions] = js.native
  
  /**
    * The specific Tag to use for Expression.
    */
  var Tags: js.UndefOr[TagValues] = js.native
}
object Expression {
  
  @scala.inline
  def apply(): Expression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expression]
  }
  
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
    
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
    def setAndVarargs(value: Expression*): Self = this.set("And", js.Array(value :_*))
    
    @scala.inline
    def setAnd(value: Expressions): Self = this.set("And", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    
    @scala.inline
    def setCostCategories(value: CostCategoryValues): Self = this.set("CostCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostCategories: Self = this.set("CostCategories", js.undefined)
    
    @scala.inline
    def setDimensions(value: DimensionValues): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setNot(value: Expression): Self = this.set("Not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("Not", js.undefined)
    
    @scala.inline
    def setOrVarargs(value: Expression*): Self = this.set("Or", js.Array(value :_*))
    
    @scala.inline
    def setOr(value: Expressions): Self = this.set("Or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOr: Self = this.set("Or", js.undefined)
    
    @scala.inline
    def setTags(value: TagValues): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
