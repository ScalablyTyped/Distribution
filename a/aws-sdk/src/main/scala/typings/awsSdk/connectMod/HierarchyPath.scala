package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyPath extends js.Object {
  
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyGroupSummary] = js.native
  
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyGroupSummary] = js.native
  
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyGroupSummary] = js.native
  
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyGroupSummary] = js.native
  
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.native
}
object HierarchyPath {
  
  @scala.inline
  def apply(): HierarchyPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyPath]
  }
  
  @scala.inline
  implicit class HierarchyPathOps[Self <: HierarchyPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLevelFive(value: HierarchyGroupSummary): Self = this.set("LevelFive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFive: Self = this.set("LevelFive", js.undefined)
    
    @scala.inline
    def setLevelFour(value: HierarchyGroupSummary): Self = this.set("LevelFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFour: Self = this.set("LevelFour", js.undefined)
    
    @scala.inline
    def setLevelOne(value: HierarchyGroupSummary): Self = this.set("LevelOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelOne: Self = this.set("LevelOne", js.undefined)
    
    @scala.inline
    def setLevelThree(value: HierarchyGroupSummary): Self = this.set("LevelThree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelThree: Self = this.set("LevelThree", js.undefined)
    
    @scala.inline
    def setLevelTwo(value: HierarchyGroupSummary): Self = this.set("LevelTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelTwo: Self = this.set("LevelTwo", js.undefined)
  }
}
