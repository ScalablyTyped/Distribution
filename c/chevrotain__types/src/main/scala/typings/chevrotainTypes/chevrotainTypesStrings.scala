package typings.chevrotainTypes

import typings.chevrotainTypes.mod.LookaheadProductionType
import typings.chevrotainTypes.mod.OptionalProductionType
import typings.chevrotainTypes.mod.ProductionType
import typings.chevrotainTypes.mod.nodeLocationTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevrotainTypesStrings {
  
  @js.native
  sealed trait Alternation
    extends StObject
       with LookaheadProductionType
       with ProductionType
  inline def Alternation: Alternation = "Alternation".asInstanceOf[Alternation]
  
  @js.native
  sealed trait Alternative
    extends StObject
       with ProductionType
  inline def Alternative: Alternative = "Alternative".asInstanceOf[Alternative]
  
  @js.native
  sealed trait NonTerminal
    extends StObject
       with ProductionType
  inline def NonTerminal: NonTerminal = "NonTerminal".asInstanceOf[NonTerminal]
  
  @js.native
  sealed trait Option
    extends StObject
       with LookaheadProductionType
       with OptionalProductionType
       with ProductionType
  inline def Option: Option = "Option".asInstanceOf[Option]
  
  @js.native
  sealed trait Repetition
    extends StObject
       with LookaheadProductionType
       with OptionalProductionType
       with ProductionType
  inline def Repetition: Repetition = "Repetition".asInstanceOf[Repetition]
  
  @js.native
  sealed trait RepetitionMandatory
    extends StObject
       with LookaheadProductionType
       with OptionalProductionType
       with ProductionType
  inline def RepetitionMandatory: RepetitionMandatory = "RepetitionMandatory".asInstanceOf[RepetitionMandatory]
  
  @js.native
  sealed trait RepetitionMandatoryWithSeparator
    extends StObject
       with LookaheadProductionType
       with OptionalProductionType
       with ProductionType
  inline def RepetitionMandatoryWithSeparator: RepetitionMandatoryWithSeparator = "RepetitionMandatoryWithSeparator".asInstanceOf[RepetitionMandatoryWithSeparator]
  
  @js.native
  sealed trait RepetitionWithSeparator
    extends StObject
       with LookaheadProductionType
       with OptionalProductionType
       with ProductionType
  inline def RepetitionWithSeparator: RepetitionWithSeparator = "RepetitionWithSeparator".asInstanceOf[RepetitionWithSeparator]
  
  @js.native
  sealed trait Rule
    extends StObject
       with ProductionType
  inline def Rule: Rule = "Rule".asInstanceOf[Rule]
  
  @js.native
  sealed trait Terminal
    extends StObject
       with ProductionType
  inline def Terminal: Terminal = "Terminal".asInstanceOf[Terminal]
  
  @js.native
  sealed trait full
    extends StObject
       with nodeLocationTrackingOptions
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait none
    extends StObject
       with nodeLocationTrackingOptions
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait onlyOffset
    extends StObject
       with nodeLocationTrackingOptions
  inline def onlyOffset: onlyOffset = "onlyOffset".asInstanceOf[onlyOffset]
  
  @js.native
  sealed trait onlyStart extends StObject
  inline def onlyStart: onlyStart = "onlyStart".asInstanceOf[onlyStart]
}
