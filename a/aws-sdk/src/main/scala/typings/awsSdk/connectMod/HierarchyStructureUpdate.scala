package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyStructureUpdate extends js.Object {
  
  /**
    * The update for level five.
    */
  var LevelFive: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level four.
    */
  var LevelFour: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level one.
    */
  var LevelOne: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level three.
    */
  var LevelThree: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level two.
    */
  var LevelTwo: js.UndefOr[HierarchyLevelUpdate] = js.native
}
object HierarchyStructureUpdate {
  
  @scala.inline
  def apply(): HierarchyStructureUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyStructureUpdate]
  }
  
  @scala.inline
  implicit class HierarchyStructureUpdateOps[Self <: HierarchyStructureUpdate] (val x: Self) extends AnyVal {
    
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
    def setLevelFive(value: HierarchyLevelUpdate): Self = this.set("LevelFive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFive: Self = this.set("LevelFive", js.undefined)
    
    @scala.inline
    def setLevelFour(value: HierarchyLevelUpdate): Self = this.set("LevelFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFour: Self = this.set("LevelFour", js.undefined)
    
    @scala.inline
    def setLevelOne(value: HierarchyLevelUpdate): Self = this.set("LevelOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelOne: Self = this.set("LevelOne", js.undefined)
    
    @scala.inline
    def setLevelThree(value: HierarchyLevelUpdate): Self = this.set("LevelThree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelThree: Self = this.set("LevelThree", js.undefined)
    
    @scala.inline
    def setLevelTwo(value: HierarchyLevelUpdate): Self = this.set("LevelTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelTwo: Self = this.set("LevelTwo", js.undefined)
  }
}
