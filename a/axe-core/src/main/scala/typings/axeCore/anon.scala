package typings.axeCore

import org.scalablytyped.runtime.StringDictionary
import typings.axeCore.mod.AriaAttrs
import typings.axeCore.mod.AriaRoles
import typings.axeCore.mod.CheckMessages
import typings.axeCore.mod.ContextObject
import typings.axeCore.mod.FramesSelector
import typings.axeCore.mod.HtmlElms
import typings.axeCore.mod.ImpactValue
import typings.axeCore.mod.Selector
import typings.axeCore.mod.SelectorList
import typings.axeCore.mod.SerialContextObject
import typings.axeCore.mod.SerialFrameSelector
import typings.axeCore.mod.SerialSelector
import typings.axeCore.mod.SerialSelectorList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with SerialContextObject {
    
    var exclude: SerialSelector | SerialSelectorList
    
    var include: js.UndefOr[SerialSelector | SerialSelectorList] = js.undefined
  }
  object `0` {
    
    inline def apply(exclude: SerialSelector | SerialSelectorList): `0` = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: SerialSelector | SerialSelectorList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: SerialFrameSelector*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: SerialSelector | SerialSelectorList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: SerialFrameSelector*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait Callback extends StObject {
    
    def callback(args: Any*): Unit
    
    var id: String
  }
  object Callback {
    
    inline def apply(callback: /* repeated */ Any => Unit, id: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* repeated */ Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var help: String
  }
  object Description {
    
    inline def apply(description: String, help: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
  }
  object Enabled {
    
    inline def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exclude
    extends StObject
       with ContextObject {
    
    var exclude: js.UndefOr[Selector | SelectorList] = js.undefined
    
    var include: Selector | SelectorList
  }
  object Exclude {
    
    inline def apply(include: Selector | SelectorList): Exclude = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: Selector | SelectorList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (Selector | FramesSelector)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: Selector | SelectorList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (Selector | FramesSelector)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait ExcludeInclude
    extends StObject
       with SerialContextObject {
    
    var exclude: js.UndefOr[SerialSelector | SerialSelectorList] = js.undefined
    
    var include: SerialSelector | SerialSelectorList
  }
  object ExcludeInclude {
    
    inline def apply(include: SerialSelector | SerialSelectorList): ExcludeInclude = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeInclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExcludeInclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: SerialSelector | SerialSelectorList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: SerialFrameSelector*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: SerialSelector | SerialSelectorList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: SerialFrameSelector*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait Impact extends StObject {
    
    var impact: js.UndefOr[ImpactValue] = js.undefined
    
    var messages: js.UndefOr[CheckMessages] = js.undefined
  }
  object Impact {
    
    inline def apply(): Impact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Impact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Impact] (val x: Self) extends AnyVal {
      
      inline def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
      
      inline def setImpactNull: Self = StObject.set(x, "impact", null)
      
      inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
      
      inline def setMessages(value: CheckMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
  
  trait Include
    extends StObject
       with ContextObject {
    
    var exclude: Selector | SelectorList
    
    var include: js.UndefOr[Selector | SelectorList] = js.undefined
  }
  object Include {
    
    inline def apply(exclude: Selector | SelectorList): Include = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Include]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Include] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: Selector | SelectorList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: (Selector | FramesSelector)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: Selector | SelectorList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (Selector | FramesSelector)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<axe-core.axe-core.RuleMetadata, 'ruleId'> */
  trait OmitRuleMetadataruleId extends StObject {
    
    var actIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var description: String
    
    var help: String
    
    var helpUrl: String
    
    var tags: js.Array[String]
  }
  object OmitRuleMetadataruleId {
    
    inline def apply(description: String, help: String, helpUrl: String, tags: js.Array[String]): OmitRuleMetadataruleId = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitRuleMetadataruleId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitRuleMetadataruleId] (val x: Self) extends AnyVal {
      
      inline def setActIds(value: js.Array[String]): Self = StObject.set(x, "actIds", value.asInstanceOf[js.Any])
      
      inline def setActIdsUndefined: Self = StObject.set(x, "actIds", js.undefined)
      
      inline def setActIdsVarargs(value: String*): Self = StObject.set(x, "actIds", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  /* Inlined std.Required<axe-core.axe-core.Standards> */
  trait RequiredStandards extends StObject {
    
    var ariaAttrs: StringDictionary[AriaAttrs]
    
    var ariaRoles: StringDictionary[AriaRoles]
    
    var cssColors: StringDictionary[js.Array[Double]]
    
    var htmlElms: StringDictionary[HtmlElms]
  }
  object RequiredStandards {
    
    inline def apply(
      ariaAttrs: StringDictionary[AriaAttrs],
      ariaRoles: StringDictionary[AriaRoles],
      cssColors: StringDictionary[js.Array[Double]],
      htmlElms: StringDictionary[HtmlElms]
    ): RequiredStandards = {
      val __obj = js.Dynamic.literal(ariaAttrs = ariaAttrs.asInstanceOf[js.Any], ariaRoles = ariaRoles.asInstanceOf[js.Any], cssColors = cssColors.asInstanceOf[js.Any], htmlElms = htmlElms.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredStandards]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredStandards] (val x: Self) extends AnyVal {
      
      inline def setAriaAttrs(value: StringDictionary[AriaAttrs]): Self = StObject.set(x, "ariaAttrs", value.asInstanceOf[js.Any])
      
      inline def setAriaRoles(value: StringDictionary[AriaRoles]): Self = StObject.set(x, "ariaRoles", value.asInstanceOf[js.Any])
      
      inline def setCssColors(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "cssColors", value.asInstanceOf[js.Any])
      
      inline def setHtmlElms(value: StringDictionary[HtmlElms]): Self = StObject.set(x, "htmlElms", value.asInstanceOf[js.Any])
    }
  }
}
