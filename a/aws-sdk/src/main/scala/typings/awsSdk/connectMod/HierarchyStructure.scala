package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyStructure extends StObject {
  
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
  implicit class HierarchyStructureMutableBuilder[Self <: HierarchyStructure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevelFive(value: HierarchyLevel): Self = StObject.set(x, "LevelFive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFiveUndefined: Self = StObject.set(x, "LevelFive", js.undefined)
    
    @scala.inline
    def setLevelFour(value: HierarchyLevel): Self = StObject.set(x, "LevelFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFourUndefined: Self = StObject.set(x, "LevelFour", js.undefined)
    
    @scala.inline
    def setLevelOne(value: HierarchyLevel): Self = StObject.set(x, "LevelOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelOneUndefined: Self = StObject.set(x, "LevelOne", js.undefined)
    
    @scala.inline
    def setLevelThree(value: HierarchyLevel): Self = StObject.set(x, "LevelThree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelThreeUndefined: Self = StObject.set(x, "LevelThree", js.undefined)
    
    @scala.inline
    def setLevelTwo(value: HierarchyLevel): Self = StObject.set(x, "LevelTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelTwoUndefined: Self = StObject.set(x, "LevelTwo", js.undefined)
  }
}
