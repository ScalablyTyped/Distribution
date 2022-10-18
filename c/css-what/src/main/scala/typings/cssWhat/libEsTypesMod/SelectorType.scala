package typings.cssWhat.libEsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectorType extends StObject
@JSImport("css-what/lib/es/types", "SelectorType")
@js.native
object SelectorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectorType & String] = js.native
  
  @js.native
  sealed trait Adjacent
    extends StObject
       with SelectorType
       with TraversalType
  /* "adjacent" */ val Adjacent: typings.cssWhat.libEsTypesMod.SelectorType.Adjacent & String = js.native
  
  @js.native
  sealed trait Attribute
    extends StObject
       with SelectorType
  /* "attribute" */ val Attribute: typings.cssWhat.libEsTypesMod.SelectorType.Attribute & String = js.native
  
  @js.native
  sealed trait Child
    extends StObject
       with SelectorType
       with TraversalType
  /* "child" */ val Child: typings.cssWhat.libEsTypesMod.SelectorType.Child & String = js.native
  
  @js.native
  sealed trait ColumnCombinator
    extends StObject
       with SelectorType
       with TraversalType
  /* "column-combinator" */ val ColumnCombinator: typings.cssWhat.libEsTypesMod.SelectorType.ColumnCombinator & String = js.native
  
  @js.native
  sealed trait Descendant
    extends StObject
       with SelectorType
       with TraversalType
  /* "descendant" */ val Descendant: typings.cssWhat.libEsTypesMod.SelectorType.Descendant & String = js.native
  
  @js.native
  sealed trait Parent
    extends StObject
       with SelectorType
       with TraversalType
  /* "parent" */ val Parent: typings.cssWhat.libEsTypesMod.SelectorType.Parent & String = js.native
  
  @js.native
  sealed trait Pseudo
    extends StObject
       with SelectorType
  /* "pseudo" */ val Pseudo: typings.cssWhat.libEsTypesMod.SelectorType.Pseudo & String = js.native
  
  @js.native
  sealed trait PseudoElement
    extends StObject
       with SelectorType
  /* "pseudo-element" */ val PseudoElement: typings.cssWhat.libEsTypesMod.SelectorType.PseudoElement & String = js.native
  
  @js.native
  sealed trait Sibling
    extends StObject
       with SelectorType
       with TraversalType
  /* "sibling" */ val Sibling: typings.cssWhat.libEsTypesMod.SelectorType.Sibling & String = js.native
  
  @js.native
  sealed trait Tag
    extends StObject
       with SelectorType
  /* "tag" */ val Tag: typings.cssWhat.libEsTypesMod.SelectorType.Tag & String = js.native
  
  @js.native
  sealed trait Universal
    extends StObject
       with SelectorType
  /* "universal" */ val Universal: typings.cssWhat.libEsTypesMod.SelectorType.Universal & String = js.native
}
