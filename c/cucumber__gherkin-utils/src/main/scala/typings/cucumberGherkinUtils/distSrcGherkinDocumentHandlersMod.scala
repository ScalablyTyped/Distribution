package typings.cucumberGherkinUtils

import typings.cucumberMessages.mod.Background
import typings.cucumberMessages.mod.Comment
import typings.cucumberMessages.mod.DataTable
import typings.cucumberMessages.mod.DocString
import typings.cucumberMessages.mod.Examples
import typings.cucumberMessages.mod.Feature
import typings.cucumberMessages.mod.Rule
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import typings.cucumberMessages.mod.TableCell
import typings.cucumberMessages.mod.TableRow
import typings.cucumberMessages.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGherkinDocumentHandlersMod {
  
  trait GherkinDocumentHandlers[Acc] extends StObject {
    
    def background(backgrounf: Background, acc: Acc): Acc
    
    def comment(comment: Comment, acc: Acc): Acc
    
    def dataTable(dataTable: DataTable, acc: Acc): Acc
    
    def docString(docString: DocString, acc: Acc): Acc
    
    def examples(examples: Examples, acc: Acc): Acc
    
    def feature(feature: Feature, acc: Acc): Acc
    
    def rule(rule: Rule, acc: Acc): Acc
    
    def scenario(scenario: Scenario, acc: Acc): Acc
    
    def step(step: Step, acc: Acc): Acc
    
    def tableCell(tableCell: TableCell, acc: Acc): Acc
    
    def tableRow(tableRow: TableRow, acc: Acc): Acc
    
    def tag(tag: Tag, acc: Acc): Acc
  }
  object GherkinDocumentHandlers {
    
    inline def apply[Acc](
      background: (Background, Acc) => Acc,
      comment: (Comment, Acc) => Acc,
      dataTable: (DataTable, Acc) => Acc,
      docString: (DocString, Acc) => Acc,
      examples: (Examples, Acc) => Acc,
      feature: (Feature, Acc) => Acc,
      rule: (Rule, Acc) => Acc,
      scenario: (Scenario, Acc) => Acc,
      step: (Step, Acc) => Acc,
      tableCell: (TableCell, Acc) => Acc,
      tableRow: (TableRow, Acc) => Acc,
      tag: (Tag, Acc) => Acc
    ): GherkinDocumentHandlers[Acc] = {
      val __obj = js.Dynamic.literal(background = js.Any.fromFunction2(background), comment = js.Any.fromFunction2(comment), dataTable = js.Any.fromFunction2(dataTable), docString = js.Any.fromFunction2(docString), examples = js.Any.fromFunction2(examples), feature = js.Any.fromFunction2(feature), rule = js.Any.fromFunction2(rule), scenario = js.Any.fromFunction2(scenario), step = js.Any.fromFunction2(step), tableCell = js.Any.fromFunction2(tableCell), tableRow = js.Any.fromFunction2(tableRow), tag = js.Any.fromFunction2(tag))
      __obj.asInstanceOf[GherkinDocumentHandlers[Acc]]
    }
    
    extension [Self <: GherkinDocumentHandlers[?], Acc](x: Self & GherkinDocumentHandlers[Acc]) {
      
      inline def setBackground(value: (Background, Acc) => Acc): Self = StObject.set(x, "background", js.Any.fromFunction2(value))
      
      inline def setComment(value: (Comment, Acc) => Acc): Self = StObject.set(x, "comment", js.Any.fromFunction2(value))
      
      inline def setDataTable(value: (DataTable, Acc) => Acc): Self = StObject.set(x, "dataTable", js.Any.fromFunction2(value))
      
      inline def setDocString(value: (DocString, Acc) => Acc): Self = StObject.set(x, "docString", js.Any.fromFunction2(value))
      
      inline def setExamples(value: (Examples, Acc) => Acc): Self = StObject.set(x, "examples", js.Any.fromFunction2(value))
      
      inline def setFeature(value: (Feature, Acc) => Acc): Self = StObject.set(x, "feature", js.Any.fromFunction2(value))
      
      inline def setRule(value: (Rule, Acc) => Acc): Self = StObject.set(x, "rule", js.Any.fromFunction2(value))
      
      inline def setScenario(value: (Scenario, Acc) => Acc): Self = StObject.set(x, "scenario", js.Any.fromFunction2(value))
      
      inline def setStep(value: (Step, Acc) => Acc): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
      
      inline def setTableCell(value: (TableCell, Acc) => Acc): Self = StObject.set(x, "tableCell", js.Any.fromFunction2(value))
      
      inline def setTableRow(value: (TableRow, Acc) => Acc): Self = StObject.set(x, "tableRow", js.Any.fromFunction2(value))
      
      inline def setTag(value: (Tag, Acc) => Acc): Self = StObject.set(x, "tag", js.Any.fromFunction2(value))
    }
  }
}
