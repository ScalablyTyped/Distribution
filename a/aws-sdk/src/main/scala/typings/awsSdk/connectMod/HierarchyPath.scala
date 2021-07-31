package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyPath extends StObject {
  
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined
  
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined
  
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined
  
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined
  
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined
}
object HierarchyPath {
  
  @scala.inline
  def apply(): HierarchyPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyPath]
  }
  
  @scala.inline
  implicit class HierarchyPathMutableBuilder[Self <: HierarchyPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevelFive(value: HierarchyGroupSummary): Self = StObject.set(x, "LevelFive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFiveUndefined: Self = StObject.set(x, "LevelFive", js.undefined)
    
    @scala.inline
    def setLevelFour(value: HierarchyGroupSummary): Self = StObject.set(x, "LevelFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFourUndefined: Self = StObject.set(x, "LevelFour", js.undefined)
    
    @scala.inline
    def setLevelOne(value: HierarchyGroupSummary): Self = StObject.set(x, "LevelOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelOneUndefined: Self = StObject.set(x, "LevelOne", js.undefined)
    
    @scala.inline
    def setLevelThree(value: HierarchyGroupSummary): Self = StObject.set(x, "LevelThree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelThreeUndefined: Self = StObject.set(x, "LevelThree", js.undefined)
    
    @scala.inline
    def setLevelTwo(value: HierarchyGroupSummary): Self = StObject.set(x, "LevelTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelTwoUndefined: Self = StObject.set(x, "LevelTwo", js.undefined)
  }
}
