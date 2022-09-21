package typings.devextremeB5DqTZzf.mod.default

import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.pdfExporter.PdfExportDataGridProps
import typings.devextremeB5DqTZzf.mod.DevExpress.pdfExporter.PdfExportGanttProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfExporter {
  
  @JSImport(".devextreme-b5DqTZzf", "default.pdfExporter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportDataGrid(options: PdfExportDataGridProps): DxPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDataGrid")(options.asInstanceOf[js.Any]).asInstanceOf[DxPromise[Unit]]
  
  inline def exportGantt(options: PdfExportGanttProps): DxPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportGantt")(options.asInstanceOf[js.Any]).asInstanceOf[DxPromise[Any]]
}
