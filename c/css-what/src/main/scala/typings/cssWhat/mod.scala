package typings.cssWhat

import typings.cssWhat.cssWhatBooleans.`false`
import typings.cssWhat.cssWhatBooleans.`true`
import typings.cssWhat.cssWhatStrings.quirks
import typings.cssWhat.typesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-what", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("css-what", "AttributeAction")
  @js.native
  object AttributeAction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.cssWhat.typesMod.AttributeAction & String] = js.native
    
    /* "any" */ val Any: typings.cssWhat.typesMod.AttributeAction.Any & String = js.native
    
    /* "element" */ val Element: typings.cssWhat.typesMod.AttributeAction.Element & String = js.native
    
    /* "end" */ val End: typings.cssWhat.typesMod.AttributeAction.End & String = js.native
    
    /* "equals" */ val Equals: typings.cssWhat.typesMod.AttributeAction.Equals & String = js.native
    
    /* "exists" */ val Exists: typings.cssWhat.typesMod.AttributeAction.Exists & String = js.native
    
    /* "hyphen" */ val Hyphen: typings.cssWhat.typesMod.AttributeAction.Hyphen & String = js.native
    
    /* "not" */ val Not: typings.cssWhat.typesMod.AttributeAction.Not & String = js.native
    
    /* "start" */ val Start: typings.cssWhat.typesMod.AttributeAction.Start & String = js.native
  }
  
  object IgnoreCaseMode {
    
    @JSImport("css-what", "IgnoreCaseMode.CaseSensitive")
    @js.native
    val CaseSensitive: `false` = js.native
    
    @JSImport("css-what", "IgnoreCaseMode.IgnoreCase")
    @js.native
    val IgnoreCase: `true` = js.native
    
    @JSImport("css-what", "IgnoreCaseMode.QuirksMode")
    @js.native
    val QuirksMode: quirks = js.native
    
    @JSImport("css-what", "IgnoreCaseMode.Unknown")
    @js.native
    val Unknown: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  }
  
  @JSImport("css-what", "SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.cssWhat.typesMod.SelectorType & String] = js.native
    
    /* "adjacent" */ val Adjacent: typings.cssWhat.typesMod.SelectorType.Adjacent & String = js.native
    
    /* "attribute" */ val Attribute: typings.cssWhat.typesMod.SelectorType.Attribute & String = js.native
    
    /* "child" */ val Child: typings.cssWhat.typesMod.SelectorType.Child & String = js.native
    
    /* "column-combinator" */ val ColumnCombinator: typings.cssWhat.typesMod.SelectorType.ColumnCombinator & String = js.native
    
    /* "descendant" */ val Descendant: typings.cssWhat.typesMod.SelectorType.Descendant & String = js.native
    
    /* "parent" */ val Parent: typings.cssWhat.typesMod.SelectorType.Parent & String = js.native
    
    /* "pseudo" */ val Pseudo: typings.cssWhat.typesMod.SelectorType.Pseudo & String = js.native
    
    /* "pseudo-element" */ val PseudoElement: typings.cssWhat.typesMod.SelectorType.PseudoElement & String = js.native
    
    /* "sibling" */ val Sibling: typings.cssWhat.typesMod.SelectorType.Sibling & String = js.native
    
    /* "tag" */ val Tag: typings.cssWhat.typesMod.SelectorType.Tag & String = js.native
    
    /* "universal" */ val Universal: typings.cssWhat.typesMod.SelectorType.Universal & String = js.native
  }
  
  inline def isTraversal(selector: Selector): /* is css-what.css-what/lib/es/types.Traversal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTraversal")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is css-what.css-what/lib/es/types.Traversal */ Boolean]
  
  inline def parse(selector: String): js.Array[js.Array[Selector]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Selector]]]
  
  inline def stringify(selector: js.Array[js.Array[Selector]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
}
