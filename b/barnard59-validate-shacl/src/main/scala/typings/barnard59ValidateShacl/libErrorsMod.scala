package typings.barnard59ValidateShacl

import typings.rdfValidateShacl.srcValidationReportMod.Factory
import typings.rdfValidateShacl.srcValidationReportMod.ValidationReport
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorsMod {
  
  trait ValidationError
    extends StObject
       with Error {
    
    var dataGraph: DatasetCore[Quad, Quad]
    
    var report: ValidationReport[Factory[Quad, Quad, DatasetCore[Quad, Quad]]]
    
    var shapesGraph: DatasetCore[Quad, Quad]
  }
  object ValidationError {
    
    inline def apply(
      dataGraph: DatasetCore[Quad, Quad],
      message: String,
      name: String,
      report: ValidationReport[Factory[Quad, Quad, DatasetCore[Quad, Quad]]],
      shapesGraph: DatasetCore[Quad, Quad]
    ): ValidationError = {
      val __obj = js.Dynamic.literal(dataGraph = dataGraph.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], shapesGraph = shapesGraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setDataGraph(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "dataGraph", value.asInstanceOf[js.Any])
      
      inline def setReport(value: ValidationReport[Factory[Quad, Quad, DatasetCore[Quad, Quad]]]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setShapesGraph(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "shapesGraph", value.asInstanceOf[js.Any])
    }
  }
}
