package typings.axeCore

import typings.axeCore.mod.AriaAttrsType
import typings.axeCore.mod.AriaRolesType
import typings.axeCore.mod.DpubRolesType
import typings.axeCore.mod.HtmlContentTypes
import typings.axeCore.mod.ReporterVersion
import typings.axeCore.mod.RunOnlyType
import typings.axeCore.mod._ImpactValue
import typings.axeCore.mod.resultGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axeCoreStrings {
  
  @scala.inline
  def `abstract`: `abstract` = "abstract".asInstanceOf[`abstract`]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @scala.inline
  def embedded: embedded = "embedded".asInstanceOf[embedded]
  
  @scala.inline
  def flow: flow = "flow".asInstanceOf[flow]
  
  @scala.inline
  def heading: heading = "heading".asInstanceOf[heading]
  
  @scala.inline
  def idref: idref = "idref".asInstanceOf[idref]
  
  @scala.inline
  def idrefs: idrefs = "idrefs".asInstanceOf[idrefs]
  
  @scala.inline
  def img: img = "img".asInstanceOf[img]
  
  @scala.inline
  def inapplicable: inapplicable = "inapplicable".asInstanceOf[inapplicable]
  
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  
  @scala.inline
  def interactive: interactive = "interactive".asInstanceOf[interactive]
  
  @scala.inline
  def landmark: landmark = "landmark".asInstanceOf[landmark]
  
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @scala.inline
  def listitem: listitem = "listitem".asInstanceOf[listitem]
  
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  
  @scala.inline
  def mntokens: mntokens = "mntokens".asInstanceOf[mntokens]
  
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  
  @scala.inline
  def nmtoken: nmtoken = "nmtoken".asInstanceOf[nmtoken]
  
  @scala.inline
  def `no-passes`: `no-passes` = "no-passes".asInstanceOf[`no-passes`]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def note: note = "note".asInstanceOf[note]
  
  @scala.inline
  def passes: passes = "passes".asInstanceOf[passes]
  
  @scala.inline
  def phrasing: phrasing = "phrasing".asInstanceOf[phrasing]
  
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @scala.inline
  def `raw-env`: `raw-env` = "raw-env".asInstanceOf[`raw-env`]
  
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @scala.inline
  def rules: rules = "rules".asInstanceOf[rules]
  
  @scala.inline
  def section: section = "section".asInstanceOf[section]
  
  @scala.inline
  def sectionhead: sectionhead = "sectionhead".asInstanceOf[sectionhead]
  
  @scala.inline
  def sectioning: sectioning = "sectioning".asInstanceOf[sectioning]
  
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  
  @scala.inline
  def serious: serious = "serious".asInstanceOf[serious]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def structure: structure = "structure".asInstanceOf[structure]
  
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
  
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
  
  @scala.inline
  def v1: v1 = "v1".asInstanceOf[v1]
  
  @scala.inline
  def v2: v2 = "v2".asInstanceOf[v2]
  
  @scala.inline
  def violations: violations = "violations".asInstanceOf[violations]
  
  @scala.inline
  def widget: widget = "widget".asInstanceOf[widget]
  
  @js.native
  sealed trait `abstract` extends AriaRolesType
  
  @js.native
  sealed trait boolean extends AriaAttrsType
  
  @js.native
  sealed trait critical extends _ImpactValue
  
  @js.native
  sealed trait decimal extends AriaAttrsType
  
  @js.native
  sealed trait embedded extends HtmlContentTypes
  
  @js.native
  sealed trait flow extends HtmlContentTypes
  
  @js.native
  sealed trait heading extends HtmlContentTypes
  
  @js.native
  sealed trait idref extends AriaAttrsType
  
  @js.native
  sealed trait idrefs extends AriaAttrsType
  
  @js.native
  sealed trait img extends DpubRolesType
  
  @js.native
  sealed trait inapplicable extends resultGroups
  
  @js.native
  sealed trait incomplete extends resultGroups
  
  @js.native
  sealed trait int extends AriaAttrsType
  
  @js.native
  sealed trait interactive extends HtmlContentTypes
  
  @js.native
  sealed trait landmark
    extends AriaRolesType
       with DpubRolesType
  
  @js.native
  sealed trait link extends DpubRolesType
  
  @js.native
  sealed trait listitem extends DpubRolesType
  
  @js.native
  sealed trait minor extends _ImpactValue
  
  @js.native
  sealed trait mntokens extends AriaAttrsType
  
  @js.native
  sealed trait moderate extends _ImpactValue
  
  @js.native
  sealed trait navigation extends DpubRolesType
  
  @js.native
  sealed trait nmtoken extends AriaAttrsType
  
  @js.native
  sealed trait `no-passes` extends ReporterVersion
  
  @js.native
  sealed trait none extends DpubRolesType
  
  @js.native
  sealed trait note extends DpubRolesType
  
  @js.native
  sealed trait passes extends resultGroups
  
  @js.native
  sealed trait phrasing extends HtmlContentTypes
  
  @js.native
  sealed trait raw extends ReporterVersion
  
  @js.native
  sealed trait `raw-env` extends ReporterVersion
  
  @js.native
  sealed trait rule extends RunOnlyType
  
  @js.native
  sealed trait rules extends RunOnlyType
  
  @js.native
  sealed trait section extends DpubRolesType
  
  @js.native
  sealed trait sectionhead extends DpubRolesType
  
  @js.native
  sealed trait sectioning extends HtmlContentTypes
  
  @js.native
  sealed trait separator extends DpubRolesType
  
  @js.native
  sealed trait serious extends _ImpactValue
  
  @js.native
  sealed trait string extends AriaAttrsType
  
  @js.native
  sealed trait structure extends AriaRolesType
  
  @js.native
  sealed trait tag extends RunOnlyType
  
  @js.native
  sealed trait tags extends RunOnlyType
  
  @js.native
  sealed trait v1 extends ReporterVersion
  
  @js.native
  sealed trait v2 extends ReporterVersion
  
  @js.native
  sealed trait violations extends resultGroups
  
  @js.native
  sealed trait widget extends AriaRolesType
}
