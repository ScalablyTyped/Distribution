package typings.busboy

import typings.busboy.busboyStrings.close
import typings.busboy.busboyStrings.error
import typings.busboy.busboyStrings.field
import typings.busboy.busboyStrings.fieldsLimit
import typings.busboy.busboyStrings.file
import typings.busboy.busboyStrings.filesLimit
import typings.busboy.busboyStrings.finish
import typings.busboy.busboyStrings.partsLimit
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: BusboyConfig): Busboy = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Busboy]
  
  @JSImport("busboy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Busboy extends Writable {
    
    def addListener[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def on[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def once[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def prependListener[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def removeListener[Event /* <: /* keyof busboy.busboy.BusboyEvents */ file | field | partsLimit | filesLimit | fieldsLimit | error | finish | close */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: busboy.busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
  }
  
  trait BusboyConfig extends StObject {
    
    /**
      * Default character set to use when one isn't defined.
      *
      * @default 'utf8'
      */
    var defCharset: js.UndefOr[String] = js.undefined
    
    /**
      * For multipart forms, the default character set to use for values of part header parameters (e.g. filename)
      * that are not extended parameters (that contain an explicit charset
      *
      * @default 'latin1'
      */
    var defParamCharset: js.UndefOr[String] = js.undefined
    
    /**
      * 'highWaterMark' to use for individual file streams
      *
      * @default stream.Readable
      */
    var fileHwm: js.UndefOr[Double] = js.undefined
    
    /**
      * These are the HTTP headers of the incoming request, which are used by individual parsers.
      */
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    /**
      * 'highWaterMark' to use for the parser stream
      *
      * @default stream.Writable
      */
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * Various limits on incoming data.
      */
    var limits: js.UndefOr[Limits] = js.undefined
    
    /**
      * If paths in filenames from file parts in a 'multipart/form-data' request shall be preserved.
      *
      * @default false
      */
    var preservePath: js.UndefOr[Boolean] = js.undefined
  }
  object BusboyConfig {
    
    inline def apply(): BusboyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BusboyConfig]
    }
    
    extension [Self <: BusboyConfig](x: Self) {
      
      inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
      
      inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
      
      inline def setDefParamCharset(value: String): Self = StObject.set(x, "defParamCharset", value.asInstanceOf[js.Any])
      
      inline def setDefParamCharsetUndefined: Self = StObject.set(x, "defParamCharset", js.undefined)
      
      inline def setFileHwm(value: Double): Self = StObject.set(x, "fileHwm", value.asInstanceOf[js.Any])
      
      inline def setFileHwmUndefined: Self = StObject.set(x, "fileHwm", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLimits(value: Limits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
    }
  }
  
  trait BusboyEvents extends StObject {
    
    /**
      * Use 'close' event instead of 'finish' event when you need to execute
      *
      * @since 1.0
      */
    def close(): Unit
    
    def error(error: Any): Unit
    
    /**
      * Emitted for each new non-file field found.
      */
    def field(name: String, value: String, info: FieldInfo): Unit
    
    /**
      * Emitted when specified `fields` limit has been reached. No more 'field' events will be emitted.
      */
    def fieldsLimit(): Unit
    
    /**
      * Emitted for each new file form field found.
      *
      * * Note: if you listen for this event, you should always handle the `stream` no matter if you care about the
      * file contents or not (e.g. you can simply just do `stream.resume();` if you want to discard the contents),
      * otherwise the 'finish' event will never fire on the Busboy instance. However, if you don't care about **any**
      * incoming files, you can simply not listen for the 'file' event at all and any/all files will be automatically
      * and safely discarded (these discarded files do still count towards `files` and `parts` limits).
      * * If a configured file size limit was reached, `stream` will both have a boolean property `truncated`
      * (best checked at the end of the stream) and emit a 'limit' event to notify you when this happens.
      *
      * @param listener.transferEncoding Contains the 'Content-Transfer-Encoding' value for the file stream.
      * @param listener.mimeType Contains the 'Content-Type' value for the file stream.
      */
    def file(name: String, stream: Readable, info: FileInfo): Unit
    
    /**
      * Emitted when specified `files` limit has been reached. No more 'file' events will be emitted.
      */
    def filesLimit(): Unit
    
    /**
      * @deprecated
      * @since 1.0
      */
    def finish(): Unit
    
    /**
      * Emitted when specified `parts` limit has been reached. No more 'file' or 'field' events will be emitted.
      */
    def partsLimit(): Unit
  }
  object BusboyEvents {
    
    inline def apply(
      close: () => Unit,
      error: Any => Unit,
      field: (String, String, FieldInfo) => Unit,
      fieldsLimit: () => Unit,
      file: (String, Readable, FileInfo) => Unit,
      filesLimit: () => Unit,
      finish: () => Unit,
      partsLimit: () => Unit
    ): BusboyEvents = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), error = js.Any.fromFunction1(error), field = js.Any.fromFunction3(field), fieldsLimit = js.Any.fromFunction0(fieldsLimit), file = js.Any.fromFunction3(file), filesLimit = js.Any.fromFunction0(filesLimit), finish = js.Any.fromFunction0(finish), partsLimit = js.Any.fromFunction0(partsLimit))
      __obj.asInstanceOf[BusboyEvents]
    }
    
    extension [Self <: BusboyEvents](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setField(value: (String, String, FieldInfo) => Unit): Self = StObject.set(x, "field", js.Any.fromFunction3(value))
      
      inline def setFieldsLimit(value: () => Unit): Self = StObject.set(x, "fieldsLimit", js.Any.fromFunction0(value))
      
      inline def setFile(value: (String, Readable, FileInfo) => Unit): Self = StObject.set(x, "file", js.Any.fromFunction3(value))
      
      inline def setFilesLimit(value: () => Unit): Self = StObject.set(x, "filesLimit", js.Any.fromFunction0(value))
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setPartsLimit(value: () => Unit): Self = StObject.set(x, "partsLimit", js.Any.fromFunction0(value))
    }
  }
  
  trait FieldInfo
    extends StObject
       with Info {
    
    var nameTruncated: Boolean
    
    var valueTruncated: Boolean
  }
  object FieldInfo {
    
    inline def apply(encoding: String, mimeType: String, nameTruncated: Boolean, valueTruncated: Boolean): FieldInfo = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], nameTruncated = nameTruncated.asInstanceOf[js.Any], valueTruncated = valueTruncated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInfo]
    }
    
    extension [Self <: FieldInfo](x: Self) {
      
      inline def setNameTruncated(value: Boolean): Self = StObject.set(x, "nameTruncated", value.asInstanceOf[js.Any])
      
      inline def setValueTruncated(value: Boolean): Self = StObject.set(x, "valueTruncated", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileInfo
    extends StObject
       with Info {
    
    var filename: String
  }
  object FileInfo {
    
    inline def apply(encoding: String, filename: String, mimeType: String): FileInfo = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Info extends StObject {
    
    var encoding: String
    
    var mimeType: String
  }
  object Info {
    
    inline def apply(encoding: String, mimeType: String): Info = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Limits extends StObject {
    
    /**
      * Max field name size (in bytes).
      *
      * @default 100
      */
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max field value size (in bytes).
      *
      * @default 1048576 (1MB)
      */
    var fieldSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of non-file fields.
      *
      * @default Infinity
      */
    var fields: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max file size (in bytes).
      *
      * @default Infinity
      */
    var fileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max number of file fields.
      *
      * @default Infinity
      */
    var files: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max number of header key-value pairs to parse.
      *
      * @default 2000 (same as node's http module)
      */
    var headerPairs: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max number of parts (fields + files).
      *
      * @default Infinity
      */
    var parts: js.UndefOr[Double] = js.undefined
  }
  object Limits {
    
    inline def apply(): Limits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Limits]
    }
    
    extension [Self <: Limits](x: Self) {
      
      inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      inline def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      inline def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    }
  }
}
