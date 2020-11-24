package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyStructure extends js.Object {
  
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyLevel] = js.native
  
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyLevel] = js.native
  
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyLevel] = js.native
  
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyLevel] = js.native
  
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyLevel] = js.native
}
object HierarchyStructure {
  
  @scala.inline
  def apply(): HierarchyStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyStructure]
  }
  
  @scala.inline
  implicit class HierarchyStructureOps[Self <: HierarchyStructure] (val x: Self) extends AnyVal {
    
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
    def setLevelFive(value: HierarchyLevel): Self = this.set("LevelFive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFive: Self = this.set("LevelFive", js.undefined)
    
    @scala.inline
    def setLevelFour(value: HierarchyLevel): Self = this.set("LevelFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFour: Self = this.set("LevelFour", js.undefined)
    
    @scala.inline
    def setLevelOne(value: HierarchyLevel): Self = this.set("LevelOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelOne: Self = this.set("LevelOne", js.undefined)
    
    @scala.inline
    def setLevelThree(value: HierarchyLevel): Self = this.set("LevelThree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelThree: Self = this.set("LevelThree", js.undefined)
    
    @scala.inline
    def setLevelTwo(value: HierarchyLevel): Self = this.set("LevelTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelTwo: Self = this.set("LevelTwo", js.undefined)
  }
}
