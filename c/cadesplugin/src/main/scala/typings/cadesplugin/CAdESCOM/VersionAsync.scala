package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.Version> */
trait VersionAsync extends StObject {
  
  val BuildVersion: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
  
  val MajorVersion: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
  
  val MinorVersion: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
  
  val toStringDefault: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  @JSName("toString")
  val toString_FVersionAsync: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): string>> */ js.Any
}
object VersionAsync {
  
  inline def apply(
    BuildVersion: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any,
    MajorVersion: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any,
    MinorVersion: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any,
    toStringDefault: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    toString_ : /* import warning: importer.ImportType#apply Failed type conversion: (): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): string>> */ js.Any
  ): VersionAsync = {
    val __obj = js.Dynamic.literal(BuildVersion = BuildVersion.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], toStringDefault = toStringDefault.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionAsync]
  }
  
  extension [Self <: VersionAsync](x: Self) {
    
    inline def setBuildVersion(
      value: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
    ): Self = StObject.set(x, "BuildVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(
      value: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
    ): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(
      value: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
    ): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    inline def setToStringDefault(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "toStringDefault", value.asInstanceOf[js.Any])
    
    inline def setToString_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(): string>> */ js.Any
    ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
  }
}
