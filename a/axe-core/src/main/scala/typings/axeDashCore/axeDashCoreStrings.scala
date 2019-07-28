package typings.axeDashCore

import typings.axeDashCore.axeDashCoreMod.ImpactValue
import typings.axeDashCore.axeDashCoreMod.ReporterVersion
import typings.axeDashCore.axeDashCoreMod.RunOnlyType
import typings.axeDashCore.axeDashCoreMod.TagValue
import typings.axeDashCore.axeDashCoreMod.resultGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object axeDashCoreStrings {
  @js.native
  sealed trait `best-practice` extends TagValue
  
  @js.native
  sealed trait critical extends ImpactValue
  
  @js.native
  sealed trait inapplicable extends resultGroups
  
  @js.native
  sealed trait incomplete extends resultGroups
  
  @js.native
  sealed trait minor extends ImpactValue
  
  @js.native
  sealed trait moderate extends ImpactValue
  
  @js.native
  sealed trait `no-passes` extends ReporterVersion
  
  @js.native
  sealed trait passes extends resultGroups
  
  @js.native
  sealed trait raw extends ReporterVersion
  
  @js.native
  sealed trait `raw-env` extends ReporterVersion
  
  @js.native
  sealed trait rule extends RunOnlyType
  
  @js.native
  sealed trait rules extends RunOnlyType
  
  @js.native
  sealed trait section508 extends TagValue
  
  @js.native
  sealed trait serious extends ImpactValue
  
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
  sealed trait wcag2a extends TagValue
  
  @js.native
  sealed trait wcag2aa extends TagValue
  
  @scala.inline
  def `best-practice`: `best-practice` = "best-practice".asInstanceOf[`best-practice`]
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  @scala.inline
  def inapplicable: inapplicable = "inapplicable".asInstanceOf[inapplicable]
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  @scala.inline
  def `no-passes`: `no-passes` = "no-passes".asInstanceOf[`no-passes`]
  @scala.inline
  def passes: passes = "passes".asInstanceOf[passes]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def `raw-env`: `raw-env` = "raw-env".asInstanceOf[`raw-env`]
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  @scala.inline
  def rules: rules = "rules".asInstanceOf[rules]
  @scala.inline
  def section508: section508 = "section508".asInstanceOf[section508]
  @scala.inline
  def serious: serious = "serious".asInstanceOf[serious]
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
  def wcag2a: wcag2a = "wcag2a".asInstanceOf[wcag2a]
  @scala.inline
  def wcag2aa: wcag2aa = "wcag2aa".asInstanceOf[wcag2aa]
}

