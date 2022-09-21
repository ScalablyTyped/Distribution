package typings.cesium

import typings.cesium.anon.DataCallback
import typings.cesium.anon.Epoch
import typings.cesium.anon.Iso8601
import typings.cesium.anon.Iso8601Dates
import typings.cesium.mod.TimeInterval
import typings.cesium.mod.TimeIntervalCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeIntervalCollectionMod {
  
  @JSImport("cesium/Source/Core/TimeIntervalCollection", JSImport.Default)
  @js.native
  open class default () extends TimeIntervalCollection {
    def this(intervals: js.Array[TimeInterval]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/TimeIntervalCollection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance from an {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} time interval (start/end/duration).
      * @param options - Object with the following properties:
      * @param options.iso8601 - An ISO 8601 interval.
      * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
      * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
      * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
      * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
      * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
      * @param [result] - An existing instance to use for the result.
      * @returns The modified result parameter or a new instance if none was provided.
      */
    inline def fromIso8601(options: Iso8601): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
    inline def fromIso8601(options: Iso8601, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
    
    /**
      * Creates a new instance from a {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date array.
      * @param options - Object with the following properties:
      * @param options.iso8601Dates - An array of ISO 8601 dates.
      * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
      * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
      * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
      * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
      * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
      * @param [result] - An existing instance to use for the result.
      * @returns The modified result parameter or a new instance if none was provided.
      */
    inline def fromIso8601DateArray(options: Iso8601Dates): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DateArray")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
    inline def fromIso8601DateArray(options: Iso8601Dates, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DateArray")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
    
    /**
      * Creates a new instance from a {@link http://en.wikipedia.org/wiki/ISO_8601|ISO 8601} duration array.
      * @param options - Object with the following properties:
      * @param options.epoch - An date that the durations are relative to.
      * @param options.iso8601Durations - An array of ISO 8601 durations.
      * @param [options.relativeToPrevious = false] - <code>true</code> if durations are relative to previous date, <code>false</code> if always relative to the epoch.
      * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
      * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
      * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
      * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
      * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
      * @param [result] - An existing instance to use for the result.
      * @returns The modified result parameter or a new instance if none was provided.
      */
    inline def fromIso8601DurationArray(options: Epoch): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DurationArray")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
    inline def fromIso8601DurationArray(options: Epoch, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601DurationArray")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
    
    /**
      * Creates a new instance from a JulianDate array.
      * @param options - Object with the following properties:
      * @param options.julianDates - An array of ISO 8601 dates.
      * @param [options.isStartIncluded = true] - <code>true</code> if start time is included in the interval, <code>false</code> otherwise.
      * @param [options.isStopIncluded = true] - <code>true</code> if stop time is included in the interval, <code>false</code> otherwise.
      * @param [options.leadingInterval = false] - <code>true</code> if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  <code>false</code> otherwise.
      * @param [options.trailingInterval = false] - <code>true</code> if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  <code>false</code> otherwise.
      * @param [options.dataCallback] - A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
      * @param [result] - An existing instance to use for the result.
      * @returns The modified result parameter or a new instance if none was provided.
      */
    inline def fromJulianDateArray(options: DataCallback): TimeIntervalCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJulianDateArray")(options.asInstanceOf[js.Any]).asInstanceOf[TimeIntervalCollection]
    inline def fromJulianDateArray(options: DataCallback, result: TimeIntervalCollection): TimeIntervalCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJulianDateArray")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeIntervalCollection]
  }
}
