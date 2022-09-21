package typings.barnard59ValidateShacl

import typings.barnard59Core.streamObjectMod.Context
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.rdfValidateShacl.validationReportMod.Factory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("barnard59-validate-shacl/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shacl(arg: Options): js.Promise[Duplex] = ^.asInstanceOf[js.Dynamic].applyDynamic("shacl")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Duplex]]
  inline def shacl(arg: Readable): js.Promise[Duplex] = ^.asInstanceOf[js.Dynamic].applyDynamic("shacl")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Duplex]]
  
  trait OnViolation extends StObject {
    
    var context: Context
    
    var data: DatasetCore[Quad, Quad]
    
    var report: typings.rdfValidateShacl.validationReportMod.^[Factory[Quad, Quad, DatasetCore[Quad, Quad]]]
  }
  object OnViolation {
    
    inline def apply(
      context: Context,
      data: DatasetCore[Quad, Quad],
      report: typings.rdfValidateShacl.validationReportMod.^[Factory[Quad, Quad, DatasetCore[Quad, Quad]]]
    ): OnViolation = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnViolation]
    }
    
    extension [Self <: OnViolation](x: Self) {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setData(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setReport(
        value: typings.rdfValidateShacl.validationReportMod.^[Factory[Quad, Quad, DatasetCore[Quad, Quad]]]
      ): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var maxErrors: js.UndefOr[Double] = js.undefined
    
    var onViolation: js.UndefOr[js.Function1[/* arg */ OnViolation, Boolean]] = js.undefined
    
    var shape: Readable
  }
  object Options {
    
    inline def apply(shape: Readable): Options = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxErrors(value: Double): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      inline def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
      
      inline def setOnViolation(value: /* arg */ OnViolation => Boolean): Self = StObject.set(x, "onViolation", js.Any.fromFunction1(value))
      
      inline def setOnViolationUndefined: Self = StObject.set(x, "onViolation", js.undefined)
      
      inline def setShape(value: Readable): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
}
