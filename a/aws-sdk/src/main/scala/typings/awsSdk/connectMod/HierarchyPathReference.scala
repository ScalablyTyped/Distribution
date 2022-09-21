package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyPathReference extends StObject {
  
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined
  
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined
  
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined
  
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined
  
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined
}
object HierarchyPathReference {
  
  inline def apply(): HierarchyPathReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyPathReference]
  }
  
  extension [Self <: HierarchyPathReference](x: Self) {
    
    inline def setLevelFive(value: HierarchyGroupSummaryReference): Self = StObject.set(x, "LevelFive", value.asInstanceOf[js.Any])
    
    inline def setLevelFiveUndefined: Self = StObject.set(x, "LevelFive", js.undefined)
    
    inline def setLevelFour(value: HierarchyGroupSummaryReference): Self = StObject.set(x, "LevelFour", value.asInstanceOf[js.Any])
    
    inline def setLevelFourUndefined: Self = StObject.set(x, "LevelFour", js.undefined)
    
    inline def setLevelOne(value: HierarchyGroupSummaryReference): Self = StObject.set(x, "LevelOne", value.asInstanceOf[js.Any])
    
    inline def setLevelOneUndefined: Self = StObject.set(x, "LevelOne", js.undefined)
    
    inline def setLevelThree(value: HierarchyGroupSummaryReference): Self = StObject.set(x, "LevelThree", value.asInstanceOf[js.Any])
    
    inline def setLevelThreeUndefined: Self = StObject.set(x, "LevelThree", js.undefined)
    
    inline def setLevelTwo(value: HierarchyGroupSummaryReference): Self = StObject.set(x, "LevelTwo", value.asInstanceOf[js.Any])
    
    inline def setLevelTwoUndefined: Self = StObject.set(x, "LevelTwo", js.undefined)
  }
}
