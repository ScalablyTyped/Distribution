package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectMod {
  
  type ChangeAction = js.Function0[js.Any]
  
  type OptionsT = typings.baseui.selectMod.Value | typings.baseui.selectMod.OptgroupsT
  
  type StateReducer = js.Function3[
    /* stateType */ java.lang.String, 
    /* nextState */ typings.baseui.selectMod.State, 
    /* currentState */ typings.baseui.selectMod.State, 
    typings.baseui.selectMod.State
  ]
  
  type Value = js.Array[typings.baseui.selectMod.Option]
  
  type filterOptions = js.Function4[
    /* options */ typings.baseui.selectMod.Value, 
    /* filterValue */ java.lang.String, 
    /* excludeOptions */ js.UndefOr[typings.baseui.selectMod.Value], 
    /* newProps */ js.UndefOr[typings.baseui.anon.FilterOption], 
    typings.baseui.selectMod.Value
  ]
}
